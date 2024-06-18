package com.taller.taller03.model.data;

import org.jooq.DSLContext;
import org.jooq.DataType;
import org.jooq.impl.DSL;

import java.sql.Connection;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.*;

public class DBGenerator {

    public static void iniciarBD(String nombreBD) throws ClassNotFoundException {
        Connection connection = DBConnector.connection("root","");
        DSLContext create = DSL.using(connection);
        crearBaseDato(create,nombreBD);
        create = actualizarConexion(connection,nombreBD);
        crearTablaPasajero(create);
        crearTablaVuelo(create);
        DBConnector.closeConnection();

    }
    public static DSLContext conectarBD(String nombre) throws ClassNotFoundException {
        Connection connection = DBConnector.connection(nombre,"root","");
        DSLContext create = DSL.using(connection);
        return create;
    }
    private static void crearBaseDato(DSLContext create, String nombreBD){
        create.createDatabaseIfNotExists(nombreBD).execute();
    }

    private static DSLContext actualizarConexion(Connection connection,String nombreBD){
        DBConnector.closeConnection();
        connection= DBConnector.connection(nombreBD,"root","");
        DSLContext create=DSL.using(connection);
        return create;
    }

    private static void crearTablaPasajero(DSLContext create){
        create.createTableIfNotExists("Pasajero")
                .column("nombre",VARCHAR(100))
                .column("contraseña",VARCHAR(100))
                .column("documentoID",VARCHAR(100))
                .column("numero",VARCHAR(100))
                .column("correo",VARCHAR(100))
                .column("fechaNac",VARCHAR(100))
                .column("nacionalidad",VARCHAR(100))
                .constraint(primaryKey("documentoID")).execute();

    }private static void crearTablaVuelo(DSLContext create){
        create.createTableIfNotExists("Vuelo")
                .column("Aerolinea",VARCHAR(100))
                .column("origen",VARCHAR(100))
                .column("destino",VARCHAR(100))
                .column("fechaSalida",VARCHAR(100))
                .column("fechaLlegada",VARCHAR(100))
                .column("horarioSalida",VARCHAR(100))
                .column("horarioLlegada",VARCHAR(100))
                .column("duracionVuelo",VARCHAR(100))
                .column("tipoAeronave",VARCHAR(100))
                .column("nAsientos",VARCHAR(100))
                .column("nVuelo",VARCHAR(100))
                .constraint(primaryKey("nVuelo")).execute();

    }

    private static void relacionarTabla(DSLContext create, String nombreTabla, String claveForanea, String nombreTablaRelacion){
        //  create.alterTableIfExists(nombreTabla).add(foreignKey(claveForanea).references(nombreTablaRelacion)).execute();
        create.alterTableIfExists(nombreTabla).alterConstraint(foreignKey(claveForanea).references(nombreTablaRelacion)).enforced();
    }
    private static void agregarColumnaTabla(DSLContext create, String nombreTabla, String columna, DataType tipoColumna){
        create.alterTableIfExists(nombreTabla).addColumn(columna,tipoColumna);
    }

}

