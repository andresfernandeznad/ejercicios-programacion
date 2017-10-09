//Ejercicio03 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio03 {
  public static void main(String[] args) {
    String linea;
    double pesetas;
    double euros;
    System.out.println("Introduzca las pesetas que quieres en euros: ");
    linea = System.console().readLine();
    pesetas = Double.parseDouble(linea);
    euros = pesetas / 166.386;
    System.out.print("Su número en euros es: ");
    System.out.print(euros);
  }
}
