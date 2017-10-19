//Ejercicio06 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = 340;
    do {
      System.out.print(numero -= 20);
    } while (numero > 160);
  }
}
