package com.br.ricardoapi.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.br.ricardoapi.orm.Pessoa;
import com.br.ricardoapi.repository.PessoaRepository;

public class AutenticacaoTokenFilter extends OncePerRequestFilter {

	private TokenService tokenService;
	private PessoaRepository pessoaRepository;
	
	public AutenticacaoTokenFilter(
			TokenService tokenService,
			PessoaRepository pessoaRepository) {
		this.tokenService = tokenService;
		this.pessoaRepository = pessoaRepository;
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {		
		String token = recupertarToken(request);
		boolean isValid = tokenService.isTokenValido(token);
		if(isValid) {
			autenticar(token); 
		}
		filterChain.doFilter(request, response);		
	}

	private void autenticar(String token) {
		Long idPessoa = tokenService.getIdPessoa(token);
		Pessoa pessoa = pessoaRepository.findById(idPessoa).get();
		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(pessoa, null, pessoa.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authentication);
	}

	private String recupertarToken(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		if(token == null || token.isEmpty() || !token.startsWith("Bearer ")) {
			return null;			
		} else {
			return token.substring(7, token.length());
		}
	}
	
	
}
