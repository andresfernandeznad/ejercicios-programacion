



package funciones;

import java.util.Scanner;

import matematicas.Matematicas;

public class Funciones {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int n = s.nextInt();
    System.out.println("Su número volteado es: " + matematicas.Matematicas.voltea(n));
    if (matematicas.Matematicas.esCapicua(n) == true) {
      System.out.println("Su número volteado es capicuo. ");
    } else {
      System.out.println("Su número volteado no es capicuo.");
    }
    
    if (matematicas.Matematicas.esPrimo(n) == true) {
      System.out.println("Su número es primo. ");
    } else {
      System.out.println("Su número no es primo.");
    }
    
    System.out.println("Su siguiente primo será: " + matematicas.Matematicas.siguientePrimo(n));
    
    System.out.println("Su número tiene " + matematicas.Matematicas.digitos(n) + " dígitos.");
    
    System.out.print("Introduce la base: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int exponente = s.nextInt();
    System.out.println("Su potencia será: " + matematicas.Matematicas.potencia(base, exponente));
    
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    int copia = numero;
    System.out.print("Introduce la posición del dígito: ");
    int posicion = s.nextInt();
    System.out.println("Su dígito es: " + matematicas.Matematicas.digitoN(numero, posicion));
    
    System.out.print("Introduce los dígitos que le quieres quitar: ");
    int quitar = s.nextInt();
    System.out.println("Su nuevo número es: " + matematicas.Matematicas.quitaPorDetras(numero, quitar));
    System.out.println("Su nuevo número es: " + matematicas.Matematicas.quitaPorDelante(copia, quitar));
    
    
  }
  
}

