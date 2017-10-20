//Ejercicio12 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca desde teclado el numero de iteraciones: ");
    int n = s.nextInt();
    int suma = 0;
    int i = 0;
    int x = 0;
    int y = 1;
    suma = x + y;
    int suma1 = 0;
    System.out.print("0, 1, 1, ");
    while (i < n - 3) {
      suma1 = y + suma; // suma = suma + x 
      System.out.print(suma1 + ", ");
      y = suma;
      suma = suma1;
      ++i;
    }
  }
}
