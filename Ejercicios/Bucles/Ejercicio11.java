//Ejercicio11 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    for (int i = numero; i <= numero + 4; ++i){
      System.out.println(i + "² = " + (i*i) + " "+ i +"³ = " + (i*i*i));
    }
  }
}
