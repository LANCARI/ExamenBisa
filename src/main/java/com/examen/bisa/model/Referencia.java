package com.examen.bisa.model;

public class Referencia {


    private int id;
    private Persona persona;

    private Cliente cliente;
    private String correo;
    private String telefono;
    private String parentesco;
    private String estado;

    private String motivo_eliminacion;

    private boolean esCliente;
    public Referencia(int id, Persona persona, Cliente cliente, String correo, String telefono, String parentesco, String estado, String motivo_eliminacion, boolean esCliente) {
        this.id = id;
        this.persona = persona;
        this.cliente = cliente;
        this.correo = correo;
        this.telefono = telefono;
        this.parentesco = parentesco;
        this.estado = estado;
        this.motivo_eliminacion = motivo_eliminacion;
        this.esCliente = esCliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo_eliminacion() {
        return motivo_eliminacion;
    }

    public void setMotivo_eliminacion(String motivo_eliminacion) {
        this.motivo_eliminacion = motivo_eliminacion;
    }

    public boolean isEsCliente() {
        return esCliente;
    }

    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }
}
