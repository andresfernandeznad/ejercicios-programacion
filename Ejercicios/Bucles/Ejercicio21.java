//Ejercicio21 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int contador = 0;
    int suma = 0;
    int mayor = 0;
    int contadorImpar = 0;
    while (numero >= 0) {
      System.out.println("Introduce un numero: ");
      numero = s.nextInt();
      ++contador;
      if ((numero%2) != 0) {
        suma += numero;
        ++contadorImpar;
      } else if ((numero%2) == 0) {
        while (numero > mayor) {
          mayor = numero;
        }
      }
    }
    System.out.println("Ha introducido " + contador + " números.");
    System.out.println("Su media es: " + (suma/(contadorImpar)));
    System.out.println("El mayor de los pares es: " + mayor);
  }
}
