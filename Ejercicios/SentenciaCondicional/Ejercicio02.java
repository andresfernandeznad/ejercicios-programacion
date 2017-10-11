//Ejercicio02 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args){
    System.out.print("Introduce la hora del día, sólo la hora: ");
    Scanner s = new Scanner(System.in);
    int hora = s.nextInt();
    if (((hora <1)||(hora > 24))) {
      System.out.print("No es una hora correcta");
    } 
    if (((hora <=12)&&(hora >= 6))){
      System.out.print("Buenos días");
    }
    if (((hora <=20)&&(hora >=13 ))){
      System.out.print("Buenas tardes");
    }
    if (((hora <=5)&&(hora >= 21))){
      System.out.print("Buenas noches");
    }
  }
}
