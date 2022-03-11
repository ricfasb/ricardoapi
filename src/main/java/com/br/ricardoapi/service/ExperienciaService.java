package com.br.ricardoapi.service;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Service;

import com.br.ricardoapi.orm.Experiencia;
import com.br.ricardoapi.repository.ExperienciaRepository;

@Service
public class ExperienciaService {
	
	private ExperienciaRepository experienciaepository;
	
	public ExperienciaService(ExperienciaRepository experienciaepository) {
		this.experienciaepository = experienciaepository;
	}

	@RequestWrapper
	public Iterable<Experiencia> getExperiencias() {
		return experienciaepository.findAll();
	}
	
}
