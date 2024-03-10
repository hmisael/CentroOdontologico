/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Usuario;

/**
 *
 * @author Hernán Misael
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    ControladoraLogica controladoraLogica = new ControladoraLogica();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        
    }

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controladoraLogica.getUsuarios();
        
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("listaUsuarios.jsp");
     }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasenia = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        controladoraLogica.crearUsuario(nombreUsuario, contrasenia, rol);
        
        response.sendRedirect("index.jsp");
    }

    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
