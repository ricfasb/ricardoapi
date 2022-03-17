package com.br.ricardoapi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.ricardoapi.orm.Pessoa;
import com.br.ricardoapi.repository.PessoaRepository;

@Service
public class AutenticacaoService implements UserDetailsService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Pessoa pessoa = pessoaRepository.findByEmail(username);		
		if( pessoa != null ) {
			return pessoa;
		}
		throw new UsernameNotFoundException("Dados inválidos!");
	}
	
}
