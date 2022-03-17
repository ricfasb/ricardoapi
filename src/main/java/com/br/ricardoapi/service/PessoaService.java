package com.br.ricardoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ricardoapi.orm.Pessoa;
import com.br.ricardoapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa getPessoa() {
		return pessoaRepository.findTopByOrderByNomeAsc();
	}

	public void cadastrar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
}
