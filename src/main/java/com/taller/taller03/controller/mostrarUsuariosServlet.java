package com.taller.taller03.controller;


import com.taller.taller03.model.Pasajero;
import com.taller.taller03.model.data.DBGenerator;
import com.taller.taller03.model.data.dao.PasajeroDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "mostrarPasajeros", value = "/mostrarPasajeros")
public class mostrarUsuariosServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        try {
            DBGenerator.iniciarBD("PasajerosDB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setAttribute("pasajeros",agregarUsuarios());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        RequestDispatcher respuesta = req.getRequestDispatcher("/mostrarPasajeros.jsp");
        respuesta.forward(req,resp);
    }

    private List agregarUsuarios() throws ClassNotFoundException {
        List<Pasajero> pasajeros = new ArrayList<>();
        pasajeros = PasajeroDAO.obtenerPasajeros(DBGenerator.conectarBD("PasajerosDB"));
        return pasajeros;
    }

}
