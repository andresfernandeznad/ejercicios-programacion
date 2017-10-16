//Ejercicio20 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero, máximo de 5 dígitos y positivo: ");
    int numero = s.nextInt();
    if ((numero > 99999)||(numero < 0)) {
      System.out.print("Introduce un número válido");
    }
    if (numero <= 9) {
      System.out.print("No puede ser capicúo porque es un número sólo.");
    } else if (numero <= 99) {
        if ((numero/10)==(numero%10)) {
        System.out.print("Su numero es capicúo");
        } else {
        System.out.print("Su número no es capicúo.");
        }
    } else if (numero <= 999) {
      if ((numero/100)==(numero%10)) {
        System.out.print("Su número es capicúo.");
      } else {
        System.out.print("Su número no es capicúo.");
      }
    } else if (numero <= 9999) {
      if ((numero/1000)==(numero%10)) {
        System.out.print("Su número es capicúo.");
      } else {
        System.out.print("Su número no es capicúo.");
      }
    } else if (numero <= 99999) {
      if ((numero/10000)==(numero%10)) {
        System.out.print("Su número es capicúo.");
      } else {
        System.out.print("Su número no es capicúo.");
      }
    }
  }
}
