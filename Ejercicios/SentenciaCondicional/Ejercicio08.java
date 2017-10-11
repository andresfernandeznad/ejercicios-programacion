//Ejercicio08 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio08 {
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
      if ((notaMedia >= 0) && (notaMedia < 5)){
        System.out.print("Su nota media es: " + notaMedia +
         " por lo tanto está suspenso.");
      }
      if ((notaMedia >= 5)&& (notaMedia < 6)){
        System.out.print("Su nota media es: " + notaMedia +
         "por lo tanto tiene un suficiente.");
      }
      if ((notaMedia >= 6)&& (notaMedia < 7)){
        System.out.print("Su nota media es: " + notaMedia +
         "por lo tanto tiene un bien.");
      }
      if ((notaMedia >= 5)&& (notaMedia < 6)){
        System.out.print("Su nota media es: " + notaMedia +
         "por lo tanto tiene un bien.");
      }
      if ((notaMedia >= 7)&& (notaMedia < 9)){
        System.out.print("Su nota media es: " + notaMedia +
         "por lo tanto tiene un notable.");
      }
      if ((notaMedia >= 9)&& (notaMedia <= 10)){
        System.out.print("Su nota media es: " + notaMedia +
         "por lo tanto tiene un sobresaliente.");
      }
    }
  }
}
