public class Empleado {
    String nombre;
    String puesto;
    double sueldo;
    String fechaIngreso;

    // Constructor
    public Empleado(String nombre, String puesto, double sueldo, String fechaIngreso) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
    }

    // Mostrar Informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }
}