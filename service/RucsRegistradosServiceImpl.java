package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.RucsRegistrados;
import com.example.demo.domain.RucsRegistradosRepository;

@Service
public class RucsRegistradosServiceImpl implements RucsRegistradosService {

	@Autowired
	private RucsRegistradosRepository rucsregistradorepository;
	
	@Override
	public Iterable<RucsRegistrados> listallrucregistrados(){
		return rucsregistradorepository.findAll();
	}
	
	@Override
	public RucsRegistrados getRucRegistradosById(long id){
		return rucsregistradorepository.findOne(id);
	}
	
	@Override
	public RucsRegistrados saveRucRegistrado(RucsRegistrados rucsregistrados){
		return rucsregistradorepository.save(rucsregistrados);
	}
	
	@Override
	public void deleteRucsRegistrados(long id){
		rucsregistradorepository.delete(id);
	}
	
	@Override
	public RucsRegistrados getRucbyNoRucRegistrado(String nroruc){
		return rucsregistradorepository.findByruc(nroruc);
	}
	
	
}
