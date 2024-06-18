package com.taller.taller03.model;

public class Vuelo {
    
    Aerolinea aerolinea;
    String origen, destino, fechaSalida, fechaLlegada, horarioSalida, horarioLlegada, duracionVuelo, tipoAeronave, nAsientos;
    int nVuelo;

    public Vuelo(Aerolinea aerolinea, String origen, String destino, String fechaSalida, String fechaLlegada, String horarioSalida, String horarioLlegada, String duracionVuelo, String tipoAeronave, String nAsientos, int nVuelo) {
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horarioSalida = horarioSalida;
        this.horarioLlegada = horarioLlegada;
        this.duracionVuelo = duracionVuelo;
        this.tipoAeronave = tipoAeronave;
        this.nAsientos = nAsientos;
        this.nVuelo = nVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    public String getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(String duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public String getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(String nAsientos) {
        this.nAsientos = nAsientos;
    }

    public int getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }
}
