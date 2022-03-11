package com.br.ricardoapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.ricardoapi.orm.Experiencia;
import com.br.ricardoapi.service.ExperienciaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
public class CurriculoController {
	
	private ExperienciaService experienciaService;
	
	CurriculoController(ExperienciaService experienciaService){
		this.experienciaService = experienciaService;
	}
	
	@RequestMapping("/experiencias") 
	@ResponseBody
	public Iterable<Experiencia> getExperiencias() {
		return this.experienciaService.getExperiencias();
	}
	
}
