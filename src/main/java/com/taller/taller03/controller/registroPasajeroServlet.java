package com.taller.taller03.controller;

import java.util.ArrayList;
import java.util.List;
import com.taller.taller03.model.Pasaje;
import com.taller.taller03.model.Pasajero;
import com.taller.taller03.model.data.DBGenerator;
import com.taller.taller03.model.data.dao.PasajeroDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jooq.DSLContext;


@WebServlet(name = "registroPasajero", value = "/registroPasajero")
public class registroPasajeroServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        try {
            DBGenerator.iniciarBD("FlyEasyDB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroPasajero.jsp");
        respuesta.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        if (req.getParameter("nombre").length() == 0 || req.getParameter("contraseña").length() == 0 || req.getParameter("documentoID").length() == 0 || req.getParameter("numero").length() == 0 || req.getParameter("correo").length() == 0) {
            RequestDispatcher respuesta = req.getRequestDispatcher("/registroErroneo.jsp");
            respuesta.forward(req, resp);
        } else {
            String nombre = req.getParameter("nombre");
            String contraseña = req.getParameter("contraseña");
            String documentoID = req.getParameter("documentoID");
            String numero = req.getParameter("numero");
            String correo = req.getParameter("correo");
            String fechaNac = req.getParameter("fechaNac");
            String nacionalidad = req.getParameter("nacionalidad");
            Pasajero pasajero = new Pasajero(nombre,contraseña, documentoID, numero,  correo, fechaNac,  nacionalidad);
            try {
                if(registrarPasajero(pasajero)){
                    req.setAttribute("pasajero",pasajero);
                    RequestDispatcher respuesta = req.getRequestDispatcher("/registroExitoso.jsp");
                    respuesta.forward(req,resp);
                }else{
                    RequestDispatcher respuesta = req.getRequestDispatcher("/registroErroneoYaRegistrado.jsp");
                    respuesta.forward(req, resp);
                }
            } catch(ClassNotFoundException e){
                throw new RuntimeException(e);
            }

        }
    }

    public static boolean registrarPasajero(Pasajero pasajero) throws ClassNotFoundException {
        DSLContext query= DBGenerator.conectarBD("FlyEasyDB");
        List<Pasajero> pasajeros = PasajeroDAO.obtenerPasajero(query,"documentoID",pasajero.getDocumentoID());
        if(pasajeros.size()!=0){
            return false;
        }
        else{
            PasajeroDAO.agregarPasajero(query,pasajero);
            return true;
        }
    }
}
