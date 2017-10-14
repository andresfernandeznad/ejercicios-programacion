//Ejercicio19 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero, máximo de 5 dígitos: ");
    int numero = s.nextInt();
    if (numero > 99999) {
      System.out.print("Introduce un número válido");
    }
    if ((numero < 10)&&(numero > -10)) {
      System.out.print("Su número tiene un dígito.");
    } else if ((numero < 100)&&(numero > -100)) {
      System.out.print("Su número tiene dos dígitos.");
    } else if ((numero < 1000)&&(numero > -1000)) {
      System.out.print("Su número tiene tres dígitos.");
    } else if ((numero < 10000)&&(numero > -10000)) {
      System.out.print("Su número tiene cuatro dígitos.");
    } else if ((numero < 100000)&&(numero > -100000)) {
      System.out.print("Su número tiene cinco dígitos.");
    }
  }
}
