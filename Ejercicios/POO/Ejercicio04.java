
package poo;

import java.util.Scanner;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Fraccion fraccion01 = new Fraccion();
    System.out.print("Introduce su numerador: ");
    fraccion01.setNumerador(s.nextInt());
    System.out.print("Introduce su denominador: ");
    fraccion01.setDenominador(s.nextInt());
    
    Fraccion fraccion02 = new Fraccion();
    System.out.print("Introduce su numerador: ");
    fraccion02.setNumerador(s.nextInt());
    System.out.print("Introduce su denominador: ");
    fraccion02.setDenominador(s.nextInt());
    System.out.println("Su primera fracción es: ");
    fraccion01.pintar();
    System.out.println("Su segunda fracción es: ");
    fraccion02.pintar();
    
    System.out.println("Su primera fracción inversa es: ");
    fraccion01.invertir(fraccion01.getNumerador(), fraccion01.getDenominador());
    
    System.out.println("Introduce el número con el que quiere simplificar: ");
    int numero = s.nextInt();
    fraccion01.simplifica(numero, fraccion01.getNumerador(), fraccion01.getDenominador());
    
    System.out.println("Su fraccion multiplicada con otra es: ");
    
    fraccion01.multiplica(fraccion02);
    
    System.out.println("Su fraccion dividida con otra es: ");
    
    fraccion01.divide(fraccion02);
  }

  
}
