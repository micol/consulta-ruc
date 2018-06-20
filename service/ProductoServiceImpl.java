package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Producto;
import com.example.demo.domain.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productorepository;
	
	@Override
	public Iterable<Producto> listallproducto(){
		return productorepository.findAll();
	}
	
	@Override
	public Producto getProductoById(long id){
		return productorepository.findOne(id);
	}
	
	@Override
	public Producto saveProducto(Producto producto){
		return productorepository.save(producto);
	}
	
	@Override
	public void deleteProduct(long id){
		productorepository.delete(id);
	}

}
