package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UbigeoRepository extends CrudRepository<Ubigeo,Long>{
	
	Ubigeo findByubigeo(String ubigeo);

}
