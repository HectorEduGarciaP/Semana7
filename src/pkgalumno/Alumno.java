package pkgalumno;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String Carnet;
    private String telefonos;
    private String direccion;

    private ArrayList<CursosAsignados> cursosAsignados;

    public Alumno(String nombre, String Carnet, String telefonos, String direccion) {
        this.nombre = nombre;
        this.Carnet = Carnet;
        this.telefonos = telefonos;
        this.direccion = direccion;
        this.cursosAsignados = new ArrayList<>();
    }

    public void agregarCursoAsignado(CursosAsignados curso) {
        this.cursosAsignados.add(curso);
    }

    @Override
    public String toString() {
        return "Carnet: " + this.Carnet + " Nombre: " + this.nombre + " Telefonos: " + this.telefonos + " Direccion: " + this.direccion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cursos Asignados: ");
        for (CursosAsignados curso : cursosAsignados) {  // Agregar las llaves para el bucle
            System.out.println("Curso: " + curso.getNombrecurso() + " Costo: " + curso.getCostocurso());
        }
        System.out.println("Telefono: " + this.telefonos);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("---------------");
    }

    public CursosAsignados[] agregarCursoAsignado() {
        CursosAsignados[] cursosAsignados1 = new CursosAsignados[0];
        return cursosAsignados1;
    }
}
