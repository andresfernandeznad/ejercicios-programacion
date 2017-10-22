//Ejercicio18 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero1 = s.nextInt();
    System.out.print("Introduce otro número: ");
    int numero2 = s.nextInt();
    if (numero1 < numero2) {
      while (numero1 < numero2) {
        System.out.print(numero1 + ", ");
        numero1 += 7;
      }
    } else {
      while (numero2 < numero1) {
        System.out.print(numero2 + ", ");
        numero2 += 7;
      }
    }
  }
}
