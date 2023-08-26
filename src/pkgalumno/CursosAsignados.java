package pkgalumno;

public class CursosAsignados {
    private int codigocurso;
    private String nombrecurso;
    private double costocurso;

    public CursosAsignados(int codigo, String nombre, double costo) {
        this.codigocurso = codigo;
        this.nombrecurso = nombre;
        this.costocurso = costo;
    }

    public int getCodigocurso() {
        return codigocurso;
    }

    public void setCodigocurso(int codigocurso) {
        this.codigocurso = codigocurso;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public double getCostocurso() {
        return costocurso;
    }

    public void setCostocurso(double costocurso) {
        this.costocurso = costocurso;
    }
}