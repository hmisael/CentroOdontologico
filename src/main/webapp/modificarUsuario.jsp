<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <%@include file="components/header.jsp"%>
    <%@include file="components/body1.jsp"%>
   
    <% Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioEditar"); %>
    
    <form class="user" action="SvModificarUsuario" method="POST">
            <div class="form-group col">
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" 
                           id="nombreUsuario" name="nombreUsuario" placeholder="Nombre Usuario"
                           value="<%=usuario.getNombreUsuario() %>">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="password" class="form-control form-control-user" 
                           id="contrasenia" name="contrasenia" placeholder="Contraseña"
                           value="<%=usuario.getContrasenia() %>">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" 
                           id="rol" name="rol" placeholder="Rol"
                           value="<%=usuario.getRol() %>">
                </div>
               
                
            </div>


        <button class="btn btn-primary btn-user btn-block" type="submit">
                Guardar cambios
            </button>
            <hr>


        </form>

    
    <%@include file="components/body2.jsp"%>

    
    
    
</html>
