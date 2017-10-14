//Ejercicio21 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la nota del primer examen: ");
    double primeraNota = s.nextDouble();
    System.out.print("Introduce la nota del segundo examen: ");
    double segundaNota = s.nextDouble();
    double media = (primeraNota + segundaNota)/2;
    if (media >= 5) {
      System.out.print("Su nota media es: " + media);
    } else {
      System.out.print("¿Cúal ha sido el resultado de la aplicación(apto/no apto)?");
      String recuperacion = s.next().toLowerCase();
      if (recuperacion.equals("apto")) {
        System.out.print("Tu nota es un 5.");
      } else {
        System.out.print("Tu nota es: " + media);
      }
    }
  }
}
