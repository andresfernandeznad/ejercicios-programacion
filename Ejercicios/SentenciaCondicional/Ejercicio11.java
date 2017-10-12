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
    int horasFaltan = 24 - horas;
    int minutosFaltan = 60 - minutos;
    if (horas == 24) {
      System.out.print("Para llegar a la madrugada quedan: " + (minutosFaltan 
      + 82800));
    }
    if ((minutos == 0)||(horas == 0)||(horas < 0)||(horas > 24)||(minutos <=0)||(minutos >=60)) {
      System.out.print("Introduzca datos no erróneos.");
    } else {
      int segundosFaltan = (horasFaltan * 3600) + (minutosFaltan * 60);
      System.out.print("Para llegar a la madrugada quedan: " + segundosFaltan + 
      " segundos.");
    }
  }
}
