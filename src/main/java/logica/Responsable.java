package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Hernán Misael
 */
@Entity
public class Responsable extends Persona implements Serializable{
  
   private String tipoResponsabilidad;

    public Responsable() {
    }

    public Responsable(String tipoResponsabilidad, int id, String dni, String nombre, String apellido, int telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    
}
