package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Ubigeo;
import com.example.demo.domain.UbigeoRepository;

@Service
public class UbigeoServiceImpl implements UbigeoService {
	
	@Autowired
	private UbigeoRepository ubigeorepository;
	
	@Override
	public Iterable<Ubigeo> listallubigeo(){
		return ubigeorepository.findAll();
	}
	
	@Override
	public Ubigeo getUbigeoById(long id){
		return ubigeorepository.findOne(id);
	}
	
	@Override
	public Ubigeo saveUbigeo(Ubigeo ubigeo){
		return ubigeorepository.save(ubigeo);
	}
	
	@Override
	public void deleteUbigeo(long id){
		ubigeorepository.delete(id);
	}
	
	@Override
	public Ubigeo getUbigeobyNoUbigeo(String nroUbigeo){
		return ubigeorepository.findByubigeo(nroUbigeo);
	}

}
