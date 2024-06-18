package com.taller.taller03.model;

public class Pasaje {
    
    String tipoPasaje, disponibilidad;
    int precio;
    Pasajero pasajero;
    Vuelo vuelo;

    public Pasaje(Pasajero pasajero, Vuelo vuelo, String tipoPasaje, String disponibilidad, int precio) {
        this.tipoPasaje = tipoPasaje;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    public String getTipoPasaje() {
        return tipoPasaje;
    }

    public void setTipoPasaje(String tipoPasaje) {
        this.tipoPasaje = tipoPasaje;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
