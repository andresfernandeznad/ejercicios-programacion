
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
          System.out.println("Su número ya está en decimal.");
          break;
        case 2:
          System.out.println("Su número en binario es: " + Matematicas.binario(numero));
          break;
        case 3:
          System.out.println("Su número en hexadecimal es: " + Matematicas.hexadecimal(numero));
          break;
        case 4:
          System.out.println("Su número en octal es: " + Matematicas.octal(numero));
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 2) {
      switch (tipoFinal) {
        case 1:
          System.out.println("Su número en decimal es: " + Matematicas.decimal(numero));
          break;
        case 2:
          System.out.println("Su número ya está en binario.");
          break;
        case 3:
          numero = Matematicas.decimal(numero);
          System.out.println("Su número en hexadecimal es: " + Matematicas.hexadecimal(numero));
          break;
        case 4:
          numero = Matematicas.decimal(numero);
          numero = Matematicas.octal(numero);
          System.out.println("Su número en octal es: " + numero);
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 3) {
      switch (tipoFinal) {
        case 1:
          System.out.println("Su número en decimal es: " + Matematicas.hexaDec(numero));
          break;
        case 2:
          numero = Matematicas.hexaDec(numero);
          System.out.println("Su número en binario es: " + Matematicas.binario(numero));
          break;
        case 3:
          System.out.print("Su número ya está en hexadecimal.");
          break;
        case 4:
          numero = Matematicas.hexaDec(numero);
          System.out.println("Su número en octal es: " + Matematicas.octal(numero));
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 4) {
      switch (tipoFinal) {
        case 1:
          numero = Matematicas.octalDec(numero);
          System.out.println("Su número en decimal es: " + numero);
          break;
        case 2:
          numero = Matematicas.octalDec(numero);
          numero = Matematicas.binario(numero);
          System.out.println("Su número en binario es: " + numero);
          break;
        case 3:
          numero = Matematicas.octalDec(numero);
          System.out.println("Su número en hexadecimal es: " + Matematicas.hexadecimal(numero));
          break;
        case 4:
          System.out.print("Su número ya está en octal.");
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
  }
  
}

