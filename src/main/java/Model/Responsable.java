package Model;

import java.util.Date;

/**
 *
 * @author Hernán Misael
 */
public class Responsable extends Persona{
  
   //private int idResponsable;
   private String tipoResponsabilidad;

    public Responsable() {
    }

    public Responsable(String tipoResponsabilidad, String dni, String apellido, int telefono, String direccion, Date fechaNac) {
        super(dni, apellido, telefono, direccion, fechaNac);
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

   
}
