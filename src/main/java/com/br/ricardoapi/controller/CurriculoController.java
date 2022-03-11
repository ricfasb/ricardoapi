package com.br.ricardoapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.ricardoapi.orm.Experiencia;
import com.br.ricardoapi.orm.Formacao;
import com.br.ricardoapi.service.ExperienciaService;
import com.br.ricardoapi.service.FormacaoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
public class CurriculoController {
	
	private ExperienciaService experienciaService;
	private FormacaoService formacaoService;
	
	CurriculoController(ExperienciaService experienciaService){
		this.experienciaService = experienciaService;
	}
	
	@RequestMapping("/experiencias") 
	@ResponseBody
	public Iterable<Experiencia> getExperiencias() {
		return this.experienciaService.getExperiencias();
	}
	
	@RequestMapping("/formacoes") 
	@ResponseBody
	public Iterable<Formacao> getFormacoes() {
		return this.formacaoService.getFormacoes();
	}
	
}
