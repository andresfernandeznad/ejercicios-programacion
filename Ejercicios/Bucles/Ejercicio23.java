//Ejercicio23 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int suma = 0;
    int contador = 0;
    while (suma < 10000) {
      System.out.print("Introduce un número: ");
      numero = s.nextInt();
      suma += numero;
      ++contador;
    }
    suma -= numero;
    --contador;
    System.out.println("El valor total de su número es: " + suma);
    System.out.println("Ha introducido " + contador + " números.");
    System.out.println("Su media es: " + (suma/contador));
  }
}
