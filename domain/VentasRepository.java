package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface VentasRepository extends CrudRepository<Ventas,Long>{

}
