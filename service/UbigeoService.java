package com.example.demo.service;

import com.example.demo.domain.Ubigeo;

public interface UbigeoService {

	Iterable<Ubigeo> listallubigeo();
	
	Ubigeo getUbigeoById(long id);
	
	Ubigeo saveUbigeo(Ubigeo ubigeo);
	
	Ubigeo getUbigeobyNoUbigeo(String nroUbigeo);
	
	void deleteUbigeo(long id);
}
