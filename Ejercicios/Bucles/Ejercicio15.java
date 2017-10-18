//Ejercicio15 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número base: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente(número entero y positivo): ");
    int exponente = s.nextInt();
    int potencia = 1;
    for (int i = 1; i <= exponente; i++){
      potencia = potencia * base;
      System.out.print(base + "^" + i + "= " + potencia + ", ");
    }
  }
}
