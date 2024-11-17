
package vista;

import java.util.Date;

public class Asistencia {
    private int matricula;
    private Date dia;
    private Date horaEntrada;
    private Date horaSalida;

    public Asistencia() {
    }

    public Asistencia(int matricula, Date dia, Date horaEntrada, Date horaSalida) {
        this.matricula = matricula;
        this.dia = dia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
}
