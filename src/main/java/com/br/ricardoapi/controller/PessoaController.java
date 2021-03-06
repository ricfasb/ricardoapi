package com.br.ricardoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.ricardoapi.form.PessoaForm;
import com.br.ricardoapi.orm.Pessoa;
import com.br.ricardoapi.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping 
	@ResponseBody
	public Pessoa getPessoa() {
		return this.pessoaService.getPessoa();
	}
	
	@PostMapping
	public void cadastrar (@RequestBody PessoaForm form) {
		Pessoa pessoa = form.converter();
		pessoaService.cadastrar(pessoa);
	}
	
}
