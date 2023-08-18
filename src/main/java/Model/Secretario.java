package Model;

import java.util.Date;

/**
 *
 * @author Hernán Misael
 */
public class Secretario extends Persona{
    //private int idSecretario;
    private String sector;
    private Usuario usuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario usuario, String dni, String apellido, int telefono, String direccion, Date fechaNac) {
        super(dni, apellido, telefono, direccion, fechaNac);
        this.sector = sector;
        this.usuario = usuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
