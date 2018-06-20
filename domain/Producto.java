package com.example.demo.domain;

import javax.persistence.*;
//import javax.validation.constraints.NotNull;


@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String tipo_producto;
	private String rubro;
	
	public Producto(String nombre, String descripcion, String categoria, String tipo_producto, String rubro) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.tipo_producto = tipo_producto;
		this.rubro = rubro;
		
	}
	
	public String getnombre() {
		return nombre;
	}
	public String getdescripcion() {
		return descripcion;
	}
	public String getcategoria() {
		return categoria;
	}
	public String gettipo_producto() {
		return tipo_producto;
	}
	public String getrubro() {
		return rubro;
	}

}
