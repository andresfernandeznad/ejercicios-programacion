//Ejercicio06 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el valor de la altura: ");
    double altura = s.nextDouble();
    double tiempo = Math.sqrt ((2*altura)/9.81);;
    if (altura < 0) {
      System.out.print("Altura no valida.");
    } else {
      System.out.print("Su objeto tardará en caer: " + tiempo + " segundos.");
    }
  }
}
