<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <%@include file="components/header.jsp"%>
    <%@include file="components/body1.jsp"%>
       
    <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Listado de usuarios</h1>
                    <p class="mb-4">A continuación, los usuarios cargados en el sistema.</p>

    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre de usuario</th>
                                            <th>Rol</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre de usuario</th>
                                            <th>Rol</th>
                                            <th style=" width: 210px">Acción</>
                                        </tr>
                                    </tfoot>
                                    
                                    <%
                                        List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                                    %>
                                    
                                    <tbody>
                                        
                                        <%
                                            for (Usuario usuario : listaUsuarios){
                                        %>
                                        
                                        <tr>
                                            <td id="id_usu<%=usuario.getIdUsuario() %>"><%=usuario.getIdUsuario()%> </td>
                                            <td><%=usuario.getNombreUsuario()%></td>
                                            <td><%=usuario.getRol()%></td>
                                            
                                            <td style="display: flex; width: 230px;">
                                               <form name="eliminar" action="SVBorrarUsuario" method="POST">
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px;">
                                                        <i class="fas fa-trash-alt"></>Eliminar
                                                    </button>
                                                    <input type=""hidden" name="id" value="<%=usuario.getIdUsuario() %>">
                                               </form>

                                               <form name="modificar" action="SVModificarUsuario" method="GET">
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px;">
                                                        <i class="fas fa-pencil-alt"></>Modificar
                                                    </button>
                                                    <input type=""hidden" name="id" value="<%=usuario.getIdUsuario() %>">
                                               </form>
                                                
                                                
                                            
                                            
                                            
                                        </tr>
                                        
                                        <% 
                                            }
                                        %>
                                        

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

    <%@include file="components/body2.jsp"%>
    
</html>
