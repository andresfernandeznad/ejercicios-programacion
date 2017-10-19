//Ejercicio03 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = 0;
    do {
      System.out.print(numero*5);
      ++numero;
    } while (numero <= 100);
  }
}
