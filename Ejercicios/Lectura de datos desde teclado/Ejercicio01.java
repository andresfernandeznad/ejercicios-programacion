//Ejercicio01 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Introduce un número: ");
    String linea;
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);
    
    System.out.println("Introduzca otro número: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt(linea);
    System.out.print("El resultado de la multiplicación es: ");
    int total = primerNumero*segundoNumero;
    System.out.print(total);
  }
}
