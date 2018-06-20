package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RucRepository extends CrudRepository<Ruc,Long>{

	Ruc findByruc(String ruc);
	
}
