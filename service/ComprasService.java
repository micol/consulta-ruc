package com.example.demo.service;

import com.example.demo.domain.Compras;

public interface ComprasService {
	
	Iterable<Compras> listallcompras();
	
	Compras getComprasById(long id);
	
	Compras saveCompras(Compras compras);
	
	void deleteCompras(long id);

}
