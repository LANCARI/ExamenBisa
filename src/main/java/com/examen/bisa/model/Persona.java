package com.examen.bisa.model;

import java.util.Date;

public class Persona {
	
	
	private int id;
	private Direccion direccion;

	private String nombre;
	private String paterno;
	private String materno;
	private Date fechaNacimiento;
	private String cedulaIdentidad;



	public Persona(int id, Direccion direccion, String nombre, String paterno, String materno, Date fechaNacimiento,
			String cedulaIdentidad) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.fechaNacimiento = fechaNacimiento;
		this.cedulaIdentidad = cedulaIdentidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getCedulaIdentidad() {
		return cedulaIdentidad;
	}
	public void setCedulaIdentidad(String cedulaIdentidad) {
		this.cedulaIdentidad = cedulaIdentidad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}





}
