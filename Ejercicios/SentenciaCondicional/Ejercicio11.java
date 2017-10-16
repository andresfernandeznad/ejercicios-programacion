//Ejercicio11 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la hora: ");
    int horas = s.nextInt();
    System.out.print("Introduce los minutos: ");
    int minutos = s.nextInt();
    if ((minutos == 0)||(horas == 0)||(horas < 0)||(horas > 24)||(minutos <=0)||(minutos >=60)) {
      System.out.print("Introduzca datos no erróneos.");
    } else {
      int segundosFaltan = (horas * 3600) + (minutos * 60);
      System.out.print("Para llegar a la madrugada quedan: " + ((24 * 3600) - segundosFaltan) + 
      " segundos.");
    }
  }
}
