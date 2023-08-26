import pkgalumno.Alumno;
import pkgalumno.CursosAsignados;

public class Main {
    public static void main(String[] args) {
        CursosAsignados curso1 = new CursosAsignados(101, "Programacion", 500);
        CursosAsignados curso2 = new CursosAsignados(105, "Derecho", 1);
        CursosAsignados curso3 = new CursosAsignados(110, "Estadistica", 450);
        CursosAsignados curso4 = new CursosAsignados(120, "Electronica", 400);

        Alumno alumno1 = new Alumno("Andrea", "123456", "12345678", "5 calle 8-36 avenida 2");
        alumno1.agregarCursoAsignado(curso2);

        Alumno alumno2 = new Alumno("Carlos", "987654", "87654321", "10 calle 15-20 avenida 6");
        alumno2.agregarCursoAsignado(curso1);
        alumno2.agregarCursoAsignado(curso3);

        Alumno alumno3 = new Alumno("Maria", "567890", "56789012", "15 calle 12-45 avenida 9");
        alumno3.agregarCursoAsignado(curso1);
        alumno3.agregarCursoAsignado(curso4);

        Alumno alumno4 = new Alumno("Juan", "456789", "34567890", "20 calle 5-67 avenida 4");
        alumno4.agregarCursoAsignado(curso2);
        alumno4.agregarCursoAsignado(curso3);
        alumno4.agregarCursoAsignado(curso4);

        alumno1.mostrarInfo();
        alumno2.mostrarInfo();
        alumno3.mostrarInfo();
        alumno4.mostrarInfo();

        calcularTotalPago(alumno1);
        calcularTotalPago(alumno2);
        calcularTotalPago(alumno3);
        calcularTotalPago(alumno4);
    }

    public static void calcularTotalPago(Alumno alumno) {
        int totalPago = 0;
        for (CursosAsignados curso : alumno.agregarCursoAsignado()) {
            totalPago += curso.getCostocurso();
        }
        System.out.println("Total a pagar por " + alumno.getClass() + ": Q" + totalPago);
        System.out.println("---------------");
    }
}
