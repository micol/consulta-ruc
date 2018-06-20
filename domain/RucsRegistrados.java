package com.example.demo.domain;

import javax.persistence.*;
//import javax.validation.constraints.NotNull;


@Entity
@Table(name="rucsregistrados")
public class RucsRegistrados {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String ruc;
	private String nombre;
	private String estado_contribuyente;
	private String telefono;
	private String email;
	
	public String getruc_nro() {
		return ruc;
	}
	public String getnombre() {
		return nombre;
	}
	public String getestado_contribuyente() {
		return estado_contribuyente;
	}
	public String gettelefono() {
		return telefono;
	}
	public String getemail() {
		return email;
	}
	
	public void setruc_nro(String nro_ruc) {
		this.ruc = nro_ruc;
	}
	public void setnombre(String nom) {
		this.nombre = nom;
	}
	public void setestado_contribuyente(String est_contr) {
		this.estado_contribuyente = est_contr;
	}
	public void settelefono(String tel) {
		this.telefono = tel;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
}
