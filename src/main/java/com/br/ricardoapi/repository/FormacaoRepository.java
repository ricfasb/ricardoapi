package com.br.ricardoapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.ricardoapi.orm.Formacao;

@Repository
public interface FormacaoRepository extends CrudRepository<Formacao, Long>{
	
}
