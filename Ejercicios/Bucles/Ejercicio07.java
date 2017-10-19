//Ejercicio07 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int i = 0;
    int combinacion = 0;
    while ((i <= 3)&&(combinacion != 1233)) {
      System.out.println("Introduce la contraseña: ");
      combinacion = s.nextInt();
      ++i;
    }
    if (combinacion == 1233) {
      System.out.print("¡Contraseña correcta!");
    } else {
      System.out.print("Caja fuerte bloqueada.");
    }
  }
}
