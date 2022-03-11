package com.br.ricardoapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.br.ricardoapi.orm.Experiencia;

@Repository
public interface ExperienciaRepository extends PagingAndSortingRepository<Experiencia, Integer>{
	
}
