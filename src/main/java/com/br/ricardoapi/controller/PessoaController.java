package com.br.ricardoapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.ricardoapi.orm.Pessoa;
import com.br.ricardoapi.service.PessoaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
public class PessoaController {
	
	private PessoaService pessoaService;
	
	PessoaController(PessoaService pessoaService){
		this.pessoaService = pessoaService;
	}
	
	@RequestMapping("/dadospessoais") 
	@ResponseBody
	public Pessoa getPessoa() {
		return this.pessoaService.getPessoa();
	}
	
}
