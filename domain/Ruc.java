package com.example.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Ruc {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
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

	
	public String getruc_nro() {
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
	
}
