package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;



@Entity
public class Ventas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nombre_producto;
	private String descripcion_producto;
	private double cantidad;
	private Date fecha;
	private String ubigeo;
	private String categoria;
	private String rubro;
	private String unidad_medida;
	private double precio;
	private String cod_unico;
	
	public Ventas(String nombre_producto, String descripcion_producto, double cantidad, Date fecha, String ubigeo, String categoria, String rubro, String unidad_medida, double precio, String cod_unico) {
		
		this.nombre_producto = nombre_producto;
		this.descripcion_producto = descripcion_producto;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.ubigeo = ubigeo;
		this.categoria = categoria;
		this.rubro = rubro;
		this.unidad_medida = unidad_medida;
		this.precio = precio;
		this.cod_unico = cod_unico;
		
	}
	
	public String getnombre_producto() {
		return nombre_producto;
	}
	public String getdescripcion_producto() {
		return descripcion_producto;
	}
	public double getcantidad() {
		return cantidad;
	}
	public Date getfecha() {
		return fecha;
	}
	public String getubigeo() {
		return ubigeo;
	}
	public String getcategoria() {
		return categoria;
	}
	public String getrubro() {
		return rubro;
	}
	public String getunidad_medida() {
		return unidad_medida;
	}
	public double getprecio() {
		return precio;
	}
	public String getcod_unico() {
		return cod_unico;
	}
}
