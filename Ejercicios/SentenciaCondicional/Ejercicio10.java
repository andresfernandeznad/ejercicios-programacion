//Ejercicio10 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce tu día de nacimiento: ");
    int dia = s.nextInt();
    System.out.print("Introduce tu mes de nacimiento: ");
    String mes = s.next().toLowerCase();
    switch (mes) {
      case "enero" :
      if ((dia >= 1)&&(dia <= 19)) {
        System.out.print("Su horóscopo es capricornio.");
      } else if (((dia >= 20)&&(dia <= 31))) {
        System.out.print("Su horóscopo es acuario.");
      }
      break;
      case "febrero" :
      if ((dia >= 1)&&(dia <= 18)) {
        System.out.print("Su horóscopo es acuario.");
      } else if (((dia >= 19)&&(dia <= 28))) {
        System.out.print("Su horóscopo es piscis.");
      }
      break;
      case "marzo" :
      if ((dia >= 21)&&(dia <= 31)) {
        System.out.print("Su horóscopo es aries.");
      } else if (((dia >= 1)&&(dia <= 20))) {
        System.out.print("Su horóscopo es piscis.");
      }
      break;
      case "abril" :
      if ((dia >= 20)&&(dia <= 30)) {
        System.out.print("Su horóscopo es tauros.");
      } else if (((dia >= 1)&&(dia <= 19))) {
        System.out.print("Su horóscopo es aries.");
      }
      break;
      case "mayo" :
      if ((dia >= 1)&&(dia <= 20)) {
        System.out.print("Su horóscopo es tauros.");
      } else if (((dia >= 21)&&(dia <= 31))) {
        System.out.print("Su horóscopo es geminis.");
      }
      break;
      case "junio" :
      if ((dia >= 1)&&(dia <= 20)) {
        System.out.print("Su horóscopo es geminis.");
      } else if (((dia >= 21)&&(dia <= 30))) {
        System.out.print("Su horóscopo es cancer.");
      }
      break;
      case "julio" :
      if ((dia >= 1)&&(dia <= 22)) {
        System.out.print("Su horóscopo es cancer.");
      } else if (((dia >= 23)&&(dia <= 31))) {
        System.out.print("Su horóscopo es leo.");
      }
      break;
      case "agosto" :
      if ((dia >= 1)&&(dia <= 22)) {
        System.out.print("Su horóscopo es leo.");
      } else if (((dia >= 23)&&(dia <= 31))) {
        System.out.print("Su horóscopo es virgo.");
      }
      break;
      case "septiembre" :
      if ((dia >= 1)&&(dia <= 22)) {
        System.out.print("Su horóscopo es virgo.");
      } else if (((dia >= 23)&&(dia <= 30))) {
        System.out.print("Su horóscopo es libra.");
      }
      break;
      case "octubre" :
      if ((dia >= 1)&&(dia <= 22)) {
        System.out.print("Su horóscopo es libra.");
      } else if (((dia >= 23)&&(dia <= 31))) {
        System.out.print("Su horóscopo es escorpio.");
      }
      break;
      case "noviembre" :
      if ((dia >= 1)&&(dia <= 21)) {
        System.out.print("Su horóscopo es escorpio.");
      } else if (((dia >= 22)&&(dia <= 30))) {
        System.out.print("Su horóscopo es sagitario.");
      }
      break;
      case "diciembre" :
      if ((dia >= 1)&&(dia <= 21)) {
        System.out.print("Su horóscopo es sagitario.");
      } else if (((dia >= 22)&&(dia <= 31))) {
        System.out.print("Su horóscopo es capricornio.");
      }
      break;
      default :
        System.out.print("Introduce datos correctos.");
    }
  }
}
