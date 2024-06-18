package com.taller.taller03.controller;


import com.taller.taller03.model.Aerolinea;
import com.taller.taller03.model.Pasajero;
import com.taller.taller03.model.Vuelo;
import com.taller.taller03.model.data.DBGenerator;
import com.taller.taller03.model.data.dao.PasajeroDAO;
import com.taller.taller03.model.data.dao.VueloDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jooq.DSLContext;

@WebServlet(name = "registroVuelos", value = "/registroVuelos")
public class registrarVuelosServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        try {
            DBGenerator.iniciarBD("FlyEasyDB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroVuelos.jsp");
        respuesta.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        String aerolinea = req.getParameter("aerolinea");
        String origen = req.getParameter("origen");
        String destino = req.getParameter("destino");
        String fechaSalida = req.getParameter("fechaSalida");
        String fechaLlegada = req.getParameter("fechaLlegada");
        String horarioSalida = req.getParameter("horarioSalida");
        String horarioLlegada= req.getParameter("horarioLlegada");
        String duracionVuelo = req.getParameter("duracionVuelo");
        String tipoAeronave = req.getParameter("tipoAeronave");
        String nAsientos = req.getParameter("nAsientos");
        int nVuelo = Integer.parseInt(req.getParameter("nVuelo"));
        Vuelo vuelo = new Vuelo(aerolinea,origen,destino,fechaSalida,fechaLlegada,horarioSalida,horarioLlegada,duracionVuelo,tipoAeronave,nAsientos,nVuelo);
        try{
            registrarVuelo(vuelo);
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }


        req.setAttribute("vuelo",vuelo);
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroExitoso.jsp");
        respuesta.forward(req,resp);
    }

    public static void registrarVuelo(Vuelo vuelo) throws ClassNotFoundException{
        DSLContext query= DBGenerator.conectarBD("FlyEasyDB");
        VueloDAO.agregarVuelo(query,vuelo);
    }
}
