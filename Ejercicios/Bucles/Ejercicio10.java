//Ejercicio10 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce números positivos, cuando quieras para introduce una negativo: ");
    int i = 0;
    int numero = 1;
    int division = 0;
    int suma = 0;
    while (numero >= 0) {
      numero = s.nextInt();
      if (numero > 0) {
        suma += numero;
        ++i;
        division = suma / i;
      }
    }
    System.out.print("Su media es: " + division);
  }
}
