
package vista;


public class Trabajador extends Persona{
    private String area;
    private String turno;
    private double salarioBase;
    private int horasLaboradas;
    private int diasTrabajados;

    public Trabajador() {
        
    }

    public Trabajador(String area, String turno, double salarioBase, int horasLaboradas, int diasTrabajados) {
        this.area = area;
        this.turno = turno;
        this.salarioBase = salarioBase;
        this.horasLaboradas = horasLaboradas;
        this.diasTrabajados = diasTrabajados;
    }

    public Trabajador(String area, String turno, double salarioBase, int horasLaboradas, int diasTrabajados, String nombre, int matricula) {
        super(nombre, matricula);
        this.area = area;
        this.turno = turno;
        this.salarioBase = salarioBase;
        this.horasLaboradas = horasLaboradas;
        this.diasTrabajados = diasTrabajados;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(int horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
    
    
}
