import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 35, 10);
        Jugador jugador2 = new Jugador("Cristiano Ronaldo","Delantero",39,7);

        // Tercer Jugador
        System.out.println("Ingrese el nombre del tercer jugador:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese la posición del tercer jugador:");
        String posicion3 = scanner.nextLine();
        System.out.println("Ingrese la edad del tercer jugador:");
        int edad3 = scanner.nextInt();
        System.out.println("Ingrese el número de camiseta del tercer jugador:");
        int numeroCamiseta3 = scanner.nextInt();
        Jugador jugador3 = new Jugador(nombre3, posicion3, edad3, numeroCamiseta3);

        // Mostrando la información de los jugadores
        System.out.println("Informacion de jugadores");
        jugador1.mostrarInformacion();
        System.out.println();
        jugador2.mostrarInformacion();
        System.out.println();
        jugador3.mostrarInformacion();
        System.out.println();

    }
}