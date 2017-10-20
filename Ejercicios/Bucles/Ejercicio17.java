//Ejercicio17 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero = s.nextInt();
    while (numero < 0) {
      System.out.print("Vuelve a introducir un numero: ");
      numero = s.nextInt();
    }
    int suma = 0;
    for (int i = 0; i<100; ++i) {
      suma += numero;
      ++numero;
    }
    System.out.print("Su suma será: " + suma);
  }
}
