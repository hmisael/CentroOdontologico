/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Hernán Misael
 */ 
public class ControladoraLogica {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void crearUsuario(String nombreUsuario, String contrasenia, String rol){
        Usuario usuario = new Usuario();
        usuario.setRol(rol);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setContrasenia(contrasenia);
        controladoraPersistencia.crearUsuario(usuario);
    }

    public List<Usuario> getUsuarios() {
        return controladoraPersistencia.getUsuarios();
    }

    public void borrarUsuario(int id) {
        controladoraPersistencia.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controladoraPersistencia.traerUsuario(id);
    }

    public void modificarUsuario(Usuario usuario) {
        controladoraPersistencia.modificarUsuario(usuario);
    }

    public boolean validarIngreso(String usuario, String contrasenia) {
        boolean ingreso = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controladoraPersistencia.getUsuarios();
        
        for (Usuario user : listaUsuarios){
            if (user.getNombreUsuario().equals(usuario)){
                if (user.getContrasenia().equals(contrasenia)){
                    ingreso = true;
                }
                else{
                    ingreso = false;
                }
            }
        }
        return ingreso;
    }
    
    
}
