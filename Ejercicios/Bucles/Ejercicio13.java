//Ejercicio13 de Bucles

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce los números: ");
    int contadorNeg = 0;
    int contadorPos = 0;
    for (int i = 0; i < 10; ++i){
      int numero = s.nextInt();
      if (numero < 0 ){
        contadorNeg = contadorNeg + 1 ;
      } else {
        contadorPos = contadorPos + 1 ;
      }
    }
    System.out.println("Usted ha introducido: " + contadorNeg +
     " números negativos y " + contadorPos + " números positivos.");
  }
}
