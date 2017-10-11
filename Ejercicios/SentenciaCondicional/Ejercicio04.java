//Ejercicio04 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args){
    System.out.print("Introduce las horas de trabajo de esta semana: ");
    Scanner s = new Scanner(System.in);
    int horas = s.nextInt();
    if (horas < 41) {
      int sueldo = horas * 12;
      System.out.print("Su trabajador ha ganado esta semana: " + sueldo);
    }
    if (horas >= 41) {
      int sueldoBase = 40 * 12;
      int sueldoExtra = (horas - 40) * 16;
      System.out.print("Su trabajador ha ganado esta semana: " + (sueldoBase +
       sueldoExtra));
    }
  }
}
