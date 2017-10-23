//Ejercicio25 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    int valorFinal;
    while (numero > 0) {
      valorFinal = numero % 10;
      System.out.print(valorFinal);
      numero = numero / 10;
    }
  }
}
