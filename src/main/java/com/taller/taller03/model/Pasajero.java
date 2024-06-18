package com.taller.taller03.model;

public class Pasajero {
    
    private String nombre, documentoID, numero, correo, fechaNac, nacionalidad,contraseña;
    private Pasaje pasaje;

    public Pasajero(String nombre,String contraseña, String documentoID, String numero, String correo, String fechaNac, String nacionalidad) {

        this.nombre = nombre;
        this.documentoID = documentoID;
        this.numero = numero;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoID() {
        return documentoID;
    }

    public void setDocumentoID(String documentoID) {
        this.documentoID = documentoID;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
