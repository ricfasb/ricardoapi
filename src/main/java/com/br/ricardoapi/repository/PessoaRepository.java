package com.br.ricardoapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.ricardoapi.orm.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{
	
	Pessoa findTopByOrderByNomeAsc();
	
}
