
package funciones;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;
import funciones.matematicas.Matematicas;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la base de origen: ");
    System.out.println("1.- Decimal.");
    System.out.println("2.- Binario.");
    System.out.println("3.- Hexadecimal.");
    System.out.println("4.- Octal.");
    int tipoOrigen = s.nextInt();
    
    System.out.print("Introduce el número que quiere cambiar de base: ");
    int numero = s.nextInt();
    System.out.println("Ahora escriba el a que tipo quiere cambiar: ");
    System.out.println("1.- Decimal.");
    System.out.println("2.- Binario.");
    System.out.println("3.- Hexadecimal.");
    System.out.println("4.- Octal.");
    int tipoFinal = s.nextInt();
    if (tipoOrigen == 1) {
      switch (tipoFinal) {
        case 1:
          
          break;
        case 2:
          
          break;
        case 3:
          
          break;
        case 4:
          
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
  }
}