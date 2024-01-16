package com.roberto.clase10.servlets;

import com.roberto.clase10.model.Partido;
import com.roberto.clase10.persistance.ControladoraPersistencia;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    ControladoraPersistencia controladora = new ControladoraPersistencia();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       

        List<Partido> partidos = controladora.listadoPartidos();               
                
        request.setAttribute("resultadosPartidos", partidos);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String partidoIdStr = request.getParameter("radios");

        if (partidoIdStr != null && !partidoIdStr.isEmpty()) {

            long partidoId = Long.parseLong(partidoIdStr);

            controladora.sumarVoto(partidoId);

            response.sendRedirect("index.jsp");

        }
    }
}
