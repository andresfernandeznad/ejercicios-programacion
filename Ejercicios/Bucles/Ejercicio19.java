//Ejercicio19 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el carácter con el que hará la pirámide: ");
    String caracter = s.next();
    System.out.print("Introduce la altura que quiere que tenga la pirámide: ");
    int altura = s.nextInt();
    for (int j = 0; j < altura; ++j) {
      System.out.println();
      for (int i = -1; i < j; ++i) {
        System.out.print(caracter);
      }
    }
  }
}
