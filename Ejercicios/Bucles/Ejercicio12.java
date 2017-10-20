//Ejercicio12 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca desde teclado el numero de iteraciones: ");
    int n = s.nextInt();
    int suma;
    int i = 0;
    int x = 0;
    int y = 1;
    System.out.print("0, ");
    while (i < n) {
      suma = x + y; 
      System.out.print(suma + ", ");
      y = suma;
      x = y;
      suma = 0;
      ++i;
    }
  }
}
