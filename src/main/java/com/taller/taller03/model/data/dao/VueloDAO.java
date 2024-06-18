package com.taller.taller03.model.data.dao;

import com.taller.taller03.model.Pasajero;
import com.taller.taller03.model.Vuelo;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class VueloDAO {
    public static void agregarVuelo(DSLContext query, Vuelo vuelo){
        Table tablaVuelo = table(name("Vuelo"));
        Field[] columnas = tablaVuelo.fields("aerolinea","origen","destino","fechaSalida","fechaLlegada","horarioSalida","horarioLlegada","duracionVuelo","tipoAeronave","nAsientos","nVuelo");
        query.insertInto(tablaVuelo, columnas[0], columnas[1],columnas[2],columnas[3],columnas[4],columnas[5],columnas[6],columnas[7],columnas[8],columnas[9],columnas[10])
                .values(vuelo.getAerolinea(),vuelo.getOrigen(),vuelo.getDestino(),vuelo.getFechaSalida(),vuelo.getFechaLlegada(),vuelo.getHorarioSalida(),vuelo.getHorarioLlegada(),vuelo.getDuracionVuelo(),vuelo.getTipoAeronave(),vuelo.getnAsientos(),vuelo.getnVuelo())
                .execute();

    }
}
