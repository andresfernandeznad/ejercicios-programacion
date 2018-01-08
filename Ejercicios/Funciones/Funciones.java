



package funciones;

import java.util.Scanner;

import matematicas.Matematicas;

public class Funciones {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int n = s.nextInt();
    System.out.println("Su número volteado es: " + matematicas.Matematicas.voltea(n));
    if (matematicas.Matematicas.esCapicua(n) == true) {
      System.out.println("Su número volteado es capicuo. ");
    } else {
      System.out.println("Su número volteado no es capicuo.");
    }
    
    if (matematicas.Matematicas.esPrimo(n) == true) {
      System.out.println("Su número es primo. ");
    } else {
      System.out.println("Su número no es primo.");
    }
    
  }
  
}

