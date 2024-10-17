public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    private int numeroCamiseta;

    // Constructor
    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    //  Mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
    }
}