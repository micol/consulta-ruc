package com.example.demo.service;

import com.example.demo.domain.Ruc;

public interface RucService {
	
    Iterable<Ruc> listallruc();
	
	Ruc getRucById(long id);
	
	Ruc saveRuc(Ruc ruc);
	
	Ruc getRucbyNoRuc(String nroruc);
	
	void deleteProduct(long id);

}
