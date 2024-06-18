package com.taller.taller03.model.data.dao;

import com.taller.taller03.model.Pasajero;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;
import java.util.ArrayList;
import java.util.List;
import static org.jooq.impl.DSL.*;

public class PasajeroDAO {

    public static List validarExistenciaPasajero(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(table("Pasajero")).where(field(columnaTabla).eq(dato)).fetch();
        return obtenerListaPasajero(resultados);
    }

    public static void agregarPasajero(DSLContext query, Pasajero pasajero){
        Table tablaPasajero = table(name("Pasajero"));
        Field[] columnas = tablaPasajero.fields("nombre","contraseña","documentoID","numero","correo","fechaNac","nacionalidad");
        query.insertInto(tablaPasajero, columnas[0], columnas[1],columnas[2],columnas[3],columnas[4],columnas[5],columnas[6])
                .values(pasajero.getNombre(),pasajero.getContraseña(),pasajero.getDocumentoID(),pasajero.getNumero(),pasajero.getCorreo(),pasajero.getFechaNac(),pasajero.getNacionalidad())
                .execute();

    }

    public static List obtenerPasajero(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Pasajero")).where(field(columnaTabla).eq(dato)).fetch();
        return obtenerListaPasajero(resultados);
    }
    public static List obtenerPasajeros(DSLContext query){
        Result resultados = query.select().from(DSL.table("Pasajero")).fetch();
        return obtenerListaPasajero(resultados);
    }

    public static Pasajero obtenerPasajeroPorDocumentoID(DSLContext query, String documentoID) {
        Result resultados = query.select().from(table("Pasajero")).where(field("documentoID").eq(documentoID)).fetch();
        if (resultados.isNotEmpty()) {
            String nombre = (String) resultados.getValue(0, "nombre");
            String contraseña = (String) resultados.getValue(0, "contraseña");
            String numero = (String) resultados.getValue(0, "numero");
            String correo = (String) resultados.getValue(0, "correo");
            String fechaNac= (String) resultados.getValue(0, "fechaNac");
            String nacionalidad= (String) resultados.getValue(0, "nacionalidad");
            return new Pasajero(nombre, contraseña, documentoID, numero, correo,fechaNac,nacionalidad);
        }
        return null;
    }

    private static List obtenerListaPasajero(Result resultados){
        List<Pasajero> pasajeros= new ArrayList<>();
        for(int fila=0; fila<resultados.size();fila++){
            String nombre = (String) resultados.getValue(fila,"nombre");
            String contraseña = (String) resultados.getValue(fila, "contraseña");
            String documentoID = (String) resultados.getValue(fila, "documentoID");
            String numero = (String) resultados.getValue(fila, "numero");
            String correo = (String) resultados.getValue(fila, "correo");
            String fechaNac= (String) resultados.getValue(fila, "fechaNac");
            String nacionalidad= (String) resultados.getValue(fila, "nacionalidad");
            pasajeros.add(new Pasajero(nombre, contraseña, documentoID, numero, correo,fechaNac,nacionalidad));
        }
        return pasajeros;
    }
    public static void actualizarPasajero(DSLContext query, Pasajero pasajero) {
        query.update(DSL.table("Pasajero"))
                .set(field("correo"), pasajero.getCorreo())
                .set(field("contraseña"), pasajero.getContraseña())
                .where(field("documentoID").eq(pasajero.getDocumentoID()))
                .execute();
    }

}
