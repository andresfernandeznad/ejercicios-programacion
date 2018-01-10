



package funciones;

import java.util.Scanner;

import funciones.matematicas.Matematicas;

public class Funciones {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int n = s.nextInt();
    System.out.println("Su número volteado es: " + Matematicas.voltea(n));
    if (Matematicas.esCapicua(n) == true) {
      System.out.println("Su número volteado es capicuo. ");
    } else {
      System.out.println("Su número volteado no es capicuo.");
    }
    
    if (Matematicas.esPrimo(n) == true) {
      System.out.println("Su número es primo. ");
    } else {
      System.out.println("Su número no es primo.");
    }
    
    System.out.println("Su siguiente primo será: " + Matematicas.siguientePrimo(n));
    
    System.out.println("Su número tiene " + Matematicas.digitos(n) + " dígitos.");
    
    System.out.print("Introduce la base: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int exponente = s.nextInt();
    System.out.println("Su potencia será: " + Matematicas.potencia(base, exponente));
    
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    int copia = numero;
    System.out.print("Introduce la posición del dígito: ");
    int posicion = s.nextInt();
    System.out.println("Su dígito es: " + Matematicas.digitoN(numero, posicion));
    
    System.out.print("Introduce los dígitos que le quieres quitar: ");
    int quitar = s.nextInt();
    System.out.println("Su nuevo número es: " + Matematicas.quitaPorDetras(numero, quitar));
    System.out.println("Su nuevo número es: " + Matematicas.quitaPorDelante(copia, quitar));
    
    System.out.print("Añade un dígito para añadirlo al número: ");
    int anyadido = s.nextInt();
    System.out.println("Su nuevo número es: " + Matematicas.pegaPorDetras(copia, anyadido));
    System.out.println("Su nuevo número es: " + Matematicas.pegaPorDelante(copia, anyadido));
    
    System.out.print("Introduce un número: ");
    numero = s.nextInt();
    System.out.print("Introduce el número que quiere encontrar: ");
    int buscar = s.nextInt();
    System.out.println("Su número está en la posición: " + Matematicas.posicionDeDigito(numero, buscar));
    
    System.out.print("Introduce un número para juntar: ");
    numero = s.nextInt();
    System.out.print("Introduce otro número: ");
    int numero2 = s.nextInt();
    System.out.println("Su número está en la posición: " + Matematicas.juntaNumeros(numero, numero2));
    
    System.out.print("Introduce un número para sacar trozo: ");
    numero = s.nextInt();
    System.out.print("Introduce la posición del principio: ");
    int x = s.nextInt();
    System.out.print("Introduce la posición del final: ");
    int y = s.nextInt();
    System.out.println("Su trozo es: " + Matematicas.trozoDeNumero(x, y, numero));
  }
  
}

