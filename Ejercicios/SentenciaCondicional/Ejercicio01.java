//Ejercicio01 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args){
    System.out.print("Introduzca el día de la semana, para mostrar la ");
    System.out.println("primera asginatura de ese dia: ");
    Scanner s = new Scanner(System.in);
    String dia = s.nextLine().toLowerCase();
    switch (dia) {
      case "lunes":
        System.out.println("A primera hora tienes programación");
        break;
      case "martes":
        System.out.println("A primera hora tienes Sistemas Informáticos");
        break;
      case "miercoles":
        System.out.println("A primera hora tienes programación");
        break;
      case "jueves":
        System.out.println("A primera hora tienes entornos de desarrollo");
        break;
      case "viernes":
        System.out.println("A primera hora tienes Sistemas informáticos");
        break;
      default:
        System.out.println("No has introducido ningún día lectivo.");
    }
  }
}
