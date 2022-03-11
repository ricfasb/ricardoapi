package com.br.ricardoapi.service;

import javax.xml.ws.RequestWrapper;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.br.ricardoapi.orm.Experiencia;
import com.br.ricardoapi.repository.ExperienciaRepository;

@Service
public class ExperienciaService {
	
	private ExperienciaRepository experienciaRepository;
	
	public ExperienciaService(ExperienciaRepository experienciaRepository) {
		this.experienciaRepository = experienciaRepository;
	}

	@RequestWrapper
	public Iterable<Experiencia> getExperiencias() {
		return experienciaRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}
	
}
