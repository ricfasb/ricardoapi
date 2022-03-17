package com.br.ricardoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.ricardoapi.orm.Experiencia;
import com.br.ricardoapi.orm.Formacao;
import com.br.ricardoapi.service.ExperienciaService;
import com.br.ricardoapi.service.FormacaoService;

@RestController
public class CurriculoController {
	
	@Autowired
	private ExperienciaService experienciaService;
	@Autowired
	private FormacaoService formacaoService;
	
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
