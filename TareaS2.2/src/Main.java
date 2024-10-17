import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado empleado1 = new Empleado("Juan","Limpieza",500,"10/05/2020");
        Empleado empleado2 = new Empleado("Pedro","Call Center",500,"10/12/2020");

        // Tercer empleado
        System.out.println("Ingrese el nombre del tercer empleado:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese el puesto del tercer empleado:");
        String puesto3 = scanner.nextLine();
        System.out.println("Ingrese la fecha de ingreso:");
        String fechaIngreso3 = scanner.nextLine();
        System.out.println("Ingrese el sueldo del tercer empleado:");
        double sueldo3 = scanner.nextDouble();
        Empleado empleado3 = new Empleado(nombre3, puesto3, sueldo3, fechaIngreso3);

        // Mostrando la información de los empleados
        System.out.println("Informacion de empleados");
        empleado1.mostrarInformacion();
        System.out.println();
        empleado2.mostrarInformacion();
        System.out.println();
        empleado3.mostrarInformacion();
        System.out.println();

    }
}