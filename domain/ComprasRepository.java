package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ComprasRepository extends CrudRepository<Compras,Long>{

}
