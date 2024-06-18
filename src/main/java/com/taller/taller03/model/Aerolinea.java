package com.taller.taller03.model;

public class Aerolinea {
    
    String nombre, codIATA;

    public Aerolinea(String nombre, String codIATA) {
        this.nombre = nombre;
        this.codIATA = codIATA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodIATA() {
        return codIATA;
    }

    public void setCodIATA(String codIATA) {
        this.codIATA = codIATA;
    }
}
