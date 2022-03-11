package com.br.ricardoapi.service;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Service;

import com.br.ricardoapi.orm.Formacao;
import com.br.ricardoapi.repository.FormacaoRepository;

@Service
public class FormacaoService {
	
	private FormacaoRepository formacaoRepository;
	
	public FormacaoService(FormacaoRepository formacaoRepository) {
		this.formacaoRepository = formacaoRepository;
	}

	@RequestWrapper
	public Iterable<Formacao> getFormacoes() {
		return formacaoRepository.findAll();
	}
	
}
