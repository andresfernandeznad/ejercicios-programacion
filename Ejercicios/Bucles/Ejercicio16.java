//Ejercicio16 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    int i = 2;
    while ((numero % i)!= 0){
      ++i;
    }
    if (numero == i) {
      System.out.print("Es primo.");
    } else {
      System.out.print("No es primo.");
    }
  }
}
