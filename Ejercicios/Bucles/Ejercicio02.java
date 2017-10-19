//Ejercicio02 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = 0;
    while (numero <= 100) {
      System.out.print(numero*5);
      ++numero;
    }
  }
}
