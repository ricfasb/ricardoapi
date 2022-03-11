package com.br.ricardoapi.service;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Service;

import com.br.ricardoapi.orm.Pessoa;
import com.br.ricardoapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	private PessoaRepository pessoaRepository;
	
	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	@RequestWrapper
	public Pessoa getPessoa() {
		return pessoaRepository.findTopByOrderByNomeAsc();
	}
	
}
