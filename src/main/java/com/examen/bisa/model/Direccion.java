package com.examen.bisa.model;

public class Direccion {
	
	private int id;
	private String ubicacionGeografica;
	private String zona;
	private String nroDomicilio;
	private String rederencia;
	public Direccion(int id, String ubicacionGeografica, String zona, String nroDomicilio, String rederencia) {
		super();
		this.id = id;
		this.ubicacionGeografica = ubicacionGeografica;
		this.zona = zona;
		this.nroDomicilio = nroDomicilio;
		this.rederencia = rederencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUbicacionGeografica() {
		return ubicacionGeografica;
	}
	public void setUbicacionGeografica(String ubicacionGeografica) {
		this.ubicacionGeografica = ubicacionGeografica;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getNroDomicilio() {
		return nroDomicilio;
	}
	public void setNroDomicilio(String nroDomicilio) {
		this.nroDomicilio = nroDomicilio;
	}
	public String getRederencia() {
		return rederencia;
	}
	public void setRederencia(String rederencia) {
		this.rederencia = rederencia;
	}	
	
}
