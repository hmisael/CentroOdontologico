<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <%@include file="components/header.jsp"%>
    <%@include file="components/body1.jsp"%>
   
    <form class="user" action="SvUsuarios" method="POST">
            <div class="form-group col">
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" 
                           id="nombreUsuario" name="nombreUsuario" placeholder="Nombre Usuario">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="password" class="form-control form-control-user" 
                           id="contrasenia" name="contrasenia" placeholder="Contraseña">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" 
                           id="rol" name="rol" placeholder="Rol">
                </div>
               
                
            </div>


            <button class="btn btn-primary btn-user btn-block" type="submit">
                Crear Usuario
            </button>
            <hr>


        </form>

    
    <%@include file="components/body2.jsp"%>

    
    
    
</html>