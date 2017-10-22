//Ejercicio22 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = 2;
    int i = 2;
    while (numero <= 100) {
      while ((numero%i) != 0) {
      ++i;
      }
      if (numero == i) {
        System.out.println("Número primo: " + numero);
      }
      i = 2;
      ++numero;
    }
  }
}
