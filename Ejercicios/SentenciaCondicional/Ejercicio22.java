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
    if (((dia.equals("viernes"))&&(hora >= 15))) {
      System.out.print("Ya estás en el fin de semana.");
    } else if (dia.equals("viernes")) {
      int horasTotal = (hora * 60);
      System.out.print("Quedan: " + ((horasTotal + minuto) - 15*60) + " minutos");
    }
    if (dia.equals("lunes")) {
      int horasTotal = ((4 * 24 + hora) * 60);
      int minutosTres = (((4 * 24) + 15) * 60);
      System.out.println("Quedan: " + (horasTotal + minuto + 
      (((horasTotal + minuto) - minutosTres))) + " minutos");
    } else if (dia.equals("martes")) {
      int horasTotal = ((3 * 24 + hora) * 60);
      int minutosTres = (((3 * 24) + 15) * 60);
      System.out.println("Quedan: " + (horasTotal + minuto + 
      (((horasTotal + minuto) - minutosTres))) + " minutos");
    } else if (dia.equals("miercoles")) {
      int horasTotal = ((2 * 24 + hora) * 60);
      int minutosTres = (((2 * 24) + 15) * 60);
      System.out.println("Quedan: " + (horasTotal + minuto + 
      (((horasTotal + minuto) - minutosTres))) + " minutos");
    } else if (dia.equals("jueves")) {
      int horasTotal = ((24 + hora) * 60);
      int minutosTres = ((24 + 15) * 60);
      System.out.println("Quedan: " + (horasTotal + minuto + 
      (((horasTotal + minuto) - minutosTres))) + " minutos");
    } 
  }
}
