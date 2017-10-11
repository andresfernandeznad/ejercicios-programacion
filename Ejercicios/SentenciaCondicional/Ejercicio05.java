//Ejercicio05 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args){
    System.out.println("Este programa va a resolver una ecuación de 1er grado");
    System.out.print("Introduce el número que acompaña a la x: ");
    Scanner s = new Scanner(System.in);
    double a = s.nextDouble();
    System.out.print("Introduce el número que va sólo: ");
    double b = s.nextDouble();
    if (a==0) {
      System.out.print("No se puede dividir por cero.");
    }
    if (a!=0) {
     double valorX = (-b / a);
     System.out.printf("El resultado de su ecuación es: " + valorX);
    }
  }
}
