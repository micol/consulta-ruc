package com.example.demo.service;

import com.example.demo.domain.Ventas;

public interface VentasService {

	Iterable<Ventas> listallventas();
	
	Ventas getVentasById(long id);
	
	Ventas saveVentas(Ventas ventas);
	
	void deleteVentas(long id);
	
}
