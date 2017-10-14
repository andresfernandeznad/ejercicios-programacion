//Ejercicio22 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el día de la semana: ");
    String dia = s.next().toLowerCase();
    System.out.print("Introduce la hora de ese día y minutos: ");
    int hora = s.nextInt();
    int minuto = s.nextInt();
    if (dia.equals("lunes")) {
      int horasTotal = (4 * 24 * hora * 60);
      System.out.print("Quedan: " + (horasTotal + minuto) + "minutos");
    } else if (dia.equals("martes")) {
      int horasTotal = (4 * 24 * hora * 60);
      System.out.print("Quedan: " + (horasTotal + minuto) + "minutos");
    } else if (dia.equals("miercoles")) {
      int horasTotal = (3 * 24 * hora * 60);
      System.out.print("Quedan: " + (horasTotal + minuto) + "minutos");
    } else if (dia.equals("jueves")) {
      int horasTotal = (2 * 24 * hora * 60);
      System.out.print("Quedan: " + (horasTotal + minuto) + "minutos");
    } else if (dia.equals("viernes")) {
      int horasTotal = (1 * 24 * hora * 60);
      System.out.print("Quedan: " + (horasTotal + minuto) + "minutos");
    }
  }
}
