package com.example.demo.service;

import com.example.demo.domain.Producto;

public interface ProductoService {
	
	Iterable<Producto> listallproducto();
	
	Producto getProductoById(long id);
	
	Producto saveProducto(Producto producto);
	
	void deleteProduct(long id);

}
