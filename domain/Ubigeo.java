package com.example.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Ubigeo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private String ubigeo;
	private String departamento;
	private String provincia;
	private String distrito;
	
	public String getubigeo() {
		return ubigeo;
	}
	public String getdepartamento() {
		return departamento;
	}
	public String getprovincia() {
		return provincia;
	}
	public String getdistrito() {
		return distrito;
	}

}
