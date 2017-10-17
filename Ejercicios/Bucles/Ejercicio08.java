//Ejercicio08 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número por teclado: ");
    int numero = s.nextInt();
    for (int i = 1; i <= 10 ; ++i) {
      System.out.println(numero + " * " + i + " = " + (i * numero));
    }
  }
}
