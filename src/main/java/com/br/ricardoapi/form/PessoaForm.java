package com.br.ricardoapi.form;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.br.ricardoapi.orm.Pessoa;

public class PessoaForm {
	
	private String nome;
	private String foto;
	private int idade;
	private String celular;
	private String email;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Pessoa converter() {
		String senha = new BCryptPasswordEncoder().encode(this.senha);
		return new Pessoa(this.nome, this.foto, this.idade, this.celular, this.email, senha);
	}	
	
}
