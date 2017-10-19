//Ejercicio05 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = 340;
    while (numero > 160) {
      System.out.print(numero -= 20);
    }
  }
}
