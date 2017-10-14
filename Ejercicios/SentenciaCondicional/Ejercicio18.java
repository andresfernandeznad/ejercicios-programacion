//Ejercicio18 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero, máximo de 5 dígitos: ");
    int numero = s.nextInt();
    if (numero > 99999) {
      System.out.print("Introduce un número válido");
    }
    int primerDigito;
    if (numero <= 9) {
      primerDigito = numero ;
      System.out.print("El primer dígito es: " + primerDigito);
    } else if (numero <= 99) {
      primerDigito = numero / 10;
      System.out.print("EL primer dígito es: " + primerDigito);
    } else if (numero <= 999) {
      primerDigito = numero / 100;
      System.out.print("El primer dígito es: " + primerDigito);
    } else if (numero <= 9999) {
      primerDigito = numero / 1000;
      System.out.print("El primer dígito es: " + primerDigito);
    } else if (numero <= 99999) {
      primerDigito = numero / 10000;
      System.out.print("El primer dígito es: " + primerDigito);
    }
  }
}
