//Ejercicio02 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio02 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la cantidad de euros que quieres transformar");
    System.out.println(" en pesetas: ");
    double euros;
    linea = System.console().readLine();
    euros = Double.parseDouble(linea);
    double pesetas;
    pesetas = euros * 166.386;
    System.out.print("Su cantidad de euros en pesetas es: ");
    System.out.print(pesetas);
  }
}
