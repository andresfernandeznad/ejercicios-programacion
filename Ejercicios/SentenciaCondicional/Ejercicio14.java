//Ejercicio14 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para comprobar si es par y/o ");
    System.out.print("divisible entre 5: ");
    int numero = s.nextInt();
    if (numero % 2 == 0) {
      System.out.print("Su número es par ");
      if (numero % 5 != 0) {
        System.out.print("pero no es divisible entre 5.");
      }
      if (numero % 5 == 0) {
        System.out.print("y además su número es divisible entre 5.");
      }
    } else if (numero % 5 == 0) {
      System.out.print("Su número no es par pero es divisible entre 5.");
    } else {
      System.out.print("Su número es impar y no es divisible entre 5.");
    }
  }
}
