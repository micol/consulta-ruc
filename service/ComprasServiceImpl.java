package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Compras;
import com.example.demo.domain.ComprasRepository;

@Service
public class ComprasServiceImpl implements ComprasService{
	
	@Autowired
	private ComprasRepository comprasrepository;
	
	@Override
	public Iterable<Compras> listallcompras(){
		return comprasrepository.findAll();
	}
	
	@Override
	public Compras getComprasById(long id){
		return comprasrepository.findOne(id);
	}
	
	@Override
	public Compras saveCompras(Compras compras){
		return comprasrepository.save(compras);
	}
	
	@Override
	public void deleteCompras(long id){
		comprasrepository.delete(id);
	}

}
