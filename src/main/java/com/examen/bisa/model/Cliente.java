package com.examen.bisa.model;




public class Cliente {
	
	
	private int id;
	private Persona persona;

	private String correo;
	private String telefono;
	private String ocupacion;

	private String estado;

	private String accesibilidad;


	public Cliente(int id, Persona persona,  String correo, String telefono, String ocupacion, String estado, String accesibilidad) {
		this.id = id;
		this.persona = persona;

		this.correo = correo;
		this.telefono = telefono;
		this.ocupacion = ocupacion;
		this.estado = estado;
		this.accesibilidad = accesibilidad;
	}

	public Cliente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(String accesibilidad) {
		this.accesibilidad = accesibilidad;
	}
}
