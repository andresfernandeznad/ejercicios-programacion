//Ejercicio07 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Dígame la primera nota para calcular la media: ");
    double primeraNota = s.nextDouble();
    System.out.print("Dígame la segunda nota para calcular la media: ");
    double segundaNota = s.nextDouble();
    System.out.print("Dígame la tercera nota para calcular la media: ");
    double terceraNota = s.nextDouble();
    
    if ((primeraNota < 0)||(segundaNota < 0)||(terceraNota < 0)) {
      System.out.print("Introduzca notas válidas.");
    } else {
      double notaMedia = (primeraNota + segundaNota + terceraNota)/3;
      System.out.print("Su nota media es: " + notaMedia);
    }
  }
}
