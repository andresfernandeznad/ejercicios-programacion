
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
    int valorFin = 0;
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
          System.out.print("Su número ya está en decimal.");
          break;
        case 2:
          System.out.print("Su número en binario es: " + Matematicas.binario(numero));

    
          break;
        case 3:
          
          break;
        case 4:
          int resto = 0;
          int octal = 0;
          while (numero > 0) {
            resto = numero % 8;
            octal = resto + (octal * 10);
            numero /= 8;
          }
          System.out.println("Su número en octal es: " + Matematicas.voltea(octal));
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
          System.out.print("Su número ya está en binario.");
    
          break;
        case 3:
          
          break;
        case 4:
          int suma1 = 0;
    
          int copia1 = numero;
          int resto1 = 0;
          for (int i = 0; i < Matematicas.digitos(copia1); ++i) {
            resto1 = numero % 10;

            suma1 += ((Matematicas.potencia(2, i)) * resto1);
            numero /= 10;
          }
          int octal = 0;
          int resto;
          while (suma1 > 0) {
            resto = suma1 % 8;
            octal = resto + (octal * 10);
            suma1 /= 8;
          }
          System.out.println("Su número en octal es: " + Matematicas.voltea(octal));
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 3) {
      switch (tipoFinal) {
        case 1:
          
          break;
        case 2:
          
    
          break;
        case 3:
          System.out.print("Su número ya está en hexadecimal.");
          break;
        case 4:
          
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    if (tipoOrigen == 4) {
      switch (tipoFinal) {
        case 1:
          
          break;
        case 2:
          
    
          break;
        case 3:
          
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