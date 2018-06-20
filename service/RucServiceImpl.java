package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Ruc;
import com.example.demo.domain.RucRepository;

@Service
public class RucServiceImpl implements RucService {

	@Autowired
	private RucRepository rucsrepository;
	
	@Override
	public Iterable<Ruc> listallruc(){
		return rucsrepository.findAll();
	}
	
	@Override
	public Ruc getRucById(long id){
		return rucsrepository.findOne(id);
	}
	
	@Override
	public Ruc saveRuc(Ruc ruc){
		return rucsrepository.save(ruc);
	}
	
	@Override
	public void deleteProduct(long id){
		rucsrepository.delete(id);
	}
	
	@Override
	public Ruc getRucbyNoRuc(String nroruc){
		return rucsrepository.findByruc(nroruc);
	}
	
}
