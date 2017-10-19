//Ejercicio09 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int i = 1;
    int digitos = 0;
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    while (i < numero) {
      i *= 10; 
      ++digitos; 
    }
    System.out.print("Su numero de dígitos es: " + digitos + ".");
  }
}
