//Ejercicio03 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número ordinal que coincida con su día: ");
    int dia = s.nextInt();
    switch (dia) {
      case 1:
        System.out.print("Lunes");
        break;
    
      case 2:
        System.out.print("Martes");
        break;
        
      case 3:
        System.out.print("Miércoles");
        break;
        
      case 4:
        System.out.print("Jueves");
        break;
        
      case 5:
        System.out.print("Viernes");
        break;
        
      case 6:
        System.out.print("Sábado");
        break;
        
      case 7:
        System.out.print("Domingo");
        break;
       
      default:
        System.out.print("Número incorrecto");
    }
  }
}
