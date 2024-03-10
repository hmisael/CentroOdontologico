package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;

/**
 *
 * @author Hernán Misael
 */
@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {
    
    
    ControladoraLogica controladoraLogica = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        boolean validacion = false;
        //Validar datos mediante controladora de capa lógica
        validacion = controladoraLogica.validarIngreso(usuario, contrasenia);
        
        if (validacion == true){
            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("usuario",usuario);
            response.sendRedirect("index.jsp");
        }
        else{
            response.sendRedirect("loginError.jsp");
        }
        
        
    }


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
