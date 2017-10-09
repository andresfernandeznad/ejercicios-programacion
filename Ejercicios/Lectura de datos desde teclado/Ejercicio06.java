//Ejercicio06 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.print("Introduce la base del triángulo: ");
    String linea;
    linea = System.console().readLine();
    int base = Integer.parseInt(linea);
    System.out.print("Introduce la áltura del triángulo: ");
    linea = System.console().readLine();
    int altura = Integer.parseInt(linea);
    double area = ((double)base * (double)altura)/2;
    System.out.printf("Su área es: %.2f", area);
  }
}
