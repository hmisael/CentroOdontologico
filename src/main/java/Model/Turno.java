package Model;

import java.util.Date;

/**
 *
 * @author Hernán Misael
 */
public class Turno {
    private int idTurno;
    private Date fechaTurno;
    private String horaTurno;
    private String motivoTurno;

    public Turno() {
    }

    public Turno(int idTurno, Date fechaTurno, String horaTurno, String motivoTurno) {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.motivoTurno = motivoTurno;
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




    
}
