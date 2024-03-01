package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hernán Misael
 */
@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTurno;
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    private String horaTurno;
    private String motivoTurno;
    @ManyToOne
    @JoinColumn(name="id_odontologo")
    private Odontologo odontologo;
    @ManyToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;
    
    public Turno() {
    }

    public Turno(int idTurno, Date fechaTurno, String horaTurno, String motivoTurno, Odontologo odontologo, Paciente paciente) {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.motivoTurno = motivoTurno;
        this.odontologo = odontologo;
        this.paciente = paciente;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getMotivoTurno() {
        return motivoTurno;
    }

    public void setMotivoTurno(String motivoTurno) {
        this.motivoTurno = motivoTurno;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
    
}
