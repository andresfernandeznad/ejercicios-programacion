//Ejercicio17 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int numero = s.nextInt();
    int ultimoDigito = numero % 10;
    System.out.print("EL último dígito es: "+ ultimoDigito);
  }
}
