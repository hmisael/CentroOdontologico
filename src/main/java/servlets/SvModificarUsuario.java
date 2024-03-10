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
import logica.Usuario;

/**
 *
 * @author Hernán Misael
 */
@WebServlet(name = "SVModificarUsuario", urlPatterns = {"/SVModificarUsuario"})
public class SvModificarUsuario extends HttpServlet {

    
    ControladoraLogica controladoraLogica = new ControladoraLogica();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usuario = controladoraLogica.traerUsuario(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuarioEditar", usuario);
        
        System.out.println("El usuario es: " + usuario.getNombreUsuario());
        
        response.sendRedirect("modificarUsuario.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasenia = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioEditar");

        usuario.setNombreUsuario(nombreUsuario);
        usuario.setContrasenia(contrasenia);
        usuario.setRol(rol);
        
        controladoraLogica.modificarUsuario(usuario);
        
        response.sendRedirect("SvUsuarios");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
