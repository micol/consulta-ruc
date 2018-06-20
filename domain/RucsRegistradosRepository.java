package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RucsRegistradosRepository extends CrudRepository<RucsRegistrados,Long>{
		
	RucsRegistrados findByruc(String ruc);
	
}
