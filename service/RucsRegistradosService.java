package com.example.demo.service;

import com.example.demo.domain.RucsRegistrados;

public interface RucsRegistradosService {
	
	Iterable<RucsRegistrados> listallrucregistrados();
	
	RucsRegistrados getRucRegistradosById(long id);
	
	RucsRegistrados saveRucRegistrado(RucsRegistrados rucsregistrados);
	
	RucsRegistrados getRucbyNoRucRegistrado(String nroruc);
	
	void deleteRucsRegistrados(long id);

}
