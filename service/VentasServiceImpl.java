package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Ventas;
import com.example.demo.domain.VentasRepository;

@Service
public class VentasServiceImpl implements VentasService{
	
	@Autowired
	private VentasRepository ventasrepository;
	
	@Override
	public Iterable<Ventas> listallventas(){
		return ventasrepository.findAll();
	}
	
	@Override
	public Ventas getVentasById(long id){
		return ventasrepository.findOne(id);
	}
	
	@Override
	public Ventas saveVentas(Ventas ventas){
		return ventasrepository.save(ventas);
	}
	
	@Override
	public void deleteVentas(long id){
		ventasrepository.delete(id);
	}

}
