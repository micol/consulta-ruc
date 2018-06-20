package com.example.demo.domain;


public class RucUbigeo {
	
	private String ruc;
	private String nombre;
	private String estado_contribuyente;
	private String estado_domicilio;
	private String ubigeo;
	private String tipo_via;
	private String nombre_via;
	private String cod_zona;
	private String tipo_zona;
	private String numero;
	private String interior;
	private String lote;
	private String departamento;
	private String manzana;
	private String kilometro;
	private String departamento_ubigeo;
	private String provincia;
	private String distrito;
	
	public RucUbigeo(String ruc, String nombre, String estado_contribuyente, String estado_domicilio, String ubigeo, String tipo_via, String nombre_via, String cod_zona, String tipo_zona, String numero, String interior, String lote, String departamento, String manzana, String kilometro, String departamento_ubigeo, String provincia, String distrito) {
		
		this.ruc = ruc;
		this.nombre = nombre;
		this.estado_contribuyente = estado_contribuyente;
		this.estado_domicilio = estado_domicilio;
		this.ubigeo = ubigeo;
		this.tipo_via = tipo_via;
		this.nombre_via = nombre_via;
		this.cod_zona = cod_zona;
		this.tipo_zona = tipo_zona;
		this.numero = numero;
		this.interior = interior;
		this.lote = lote;
		this.departamento = departamento;
		this.manzana = manzana;
		this.kilometro = kilometro;
		this.departamento_ubigeo = departamento_ubigeo;
		this.provincia = provincia;
		this.distrito = distrito;
		
	}
	
	public RucUbigeo() {
		

	}
	
	public String getruc() {
		return ruc;
	}
	public String getnombre() {
		return nombre;
	}
	public String getestado_contribuyente() {
		return estado_contribuyente;
	}
	public String getestado_domicilio() {
		return estado_domicilio;
	}
	public String getubigeo() {
		return ubigeo;
	}
	public String gettipo_via() {
		return tipo_via;
	}
	public String getnombre_via() {
		return nombre_via;
	}
	public String getcod_zona() {
		return cod_zona;
	}
	public String gettipo_zona() {
		return tipo_zona;
	}
	public String getnumero() {
		return numero;
	}
	public String getinterior() {
		return interior;
	}
	public String getlote() {
		return lote;
	}
	public String getdepartamento() {
		return departamento;
	}
	public String getmanzana() {
		return manzana;
	}
	public String getkilometro() {
		return kilometro;
	}
	public String getdepartamento_ubigeo() {
		return departamento_ubigeo;
	}
	public String getprovincia() {
		return provincia;
	}
	public String getdistrito() {
		return distrito;
	}
	
	
	public void setruc(String ruc) {
		this.ruc = ruc;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public void setestado_contribuyente(String estado_contribuyente) {
		this.estado_contribuyente = estado_contribuyente;
	}
	public void setestado_domicilio(String estado_domicilio) {
		this.estado_domicilio = estado_domicilio;
	}
	public void setubigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
	public void settipo_via(String tipo_via) {
		this.tipo_via = tipo_via;
	}
	public void setnombre_via(String nombre_via) {
		this.nombre_via = nombre_via;
	}
	public void setcod_zona(String cod_zona) {
		this.cod_zona = cod_zona;
	}
	public void settipo_zona(String tipo_zona) {
		this.tipo_zona = tipo_zona;
	}
	public void setnumero(String numero) {
		this.numero = numero;
	}
	public void setinterior(String interior) {
		this.interior = interior;
	}
	public void setlote(String lote) {
		this.lote = lote;
	}
	public void setdepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setmanzana(String manzana) {
		this.manzana = manzana;
	}
	public void setkilometro(String kilometro) {
		this.kilometro = kilometro;
	}
	public void setdepartamento_ubigeo(String departamento_ubigeo) {
		this.departamento_ubigeo = departamento_ubigeo;
	}
	public void setprovincia(String provincia) {
		this.provincia = provincia;
	}
	public void setdistrito(String distrito) {
		this.distrito = distrito;
	}
	
}
