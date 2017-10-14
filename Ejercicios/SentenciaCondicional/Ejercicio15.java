//Ejercicio15 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el carácter con el que quiere dibujar una ");
    System.out.print("pirámide rellena: ");
    String caracter = s.next();
    System.out.print("Ahora introduce la dirección a la que quieres que ");
    System.out.print("apunte la pirámide: ");
    String direccion = s.next().toLowerCase();
    if (direccion.equals("arriba")) {
      System.out.println("  " + caracter + "  ");
      System.out.println(" " + caracter + caracter + caracter + " ");
      System.out.println(caracter + caracter + caracter + caracter + caracter);
    }
    if (direccion.equals("abajo")) {
      System.out.println(caracter + caracter + caracter + caracter + caracter);
      System.out.println(" " + caracter + caracter + caracter + " ");
      System.out.println("  " + caracter + "  ");
    }
    if (direccion.equals("derecha")) {
      System.out.println(caracter);
      System.out.println(caracter + caracter);
      System.out.println(caracter + caracter + caracter);
      System.out.println(caracter + caracter);
      System.out.println(caracter);
    }
    if (direccion.equals("izquierda")) {
      System.out.println("  " + caracter);
      System.out.println(" " + caracter + caracter);
      System.out.println(caracter + caracter + caracter);
      System.out.println(" " + caracter + caracter);
      System.out.println("  " + caracter);
    }
  }
}
