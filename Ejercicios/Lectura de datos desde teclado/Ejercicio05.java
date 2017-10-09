//Ejercicio05 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.print("Introduce el lado del rectángulo: ");
    String linea;
    linea = System.console().readLine();
    int lado = Integer.parseInt(linea);
    System.out.print("Introduce la base del rectángulo: ");
    linea = System.console().readLine();
    int base = Integer.parseInt(linea);
    int area = base * lado;
    System.out.printf("Su área será: %d", area);
  }
}
