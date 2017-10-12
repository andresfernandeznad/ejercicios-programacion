//Ejercicio12 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Preguntas tipo test, responde con si o no: ");
    int contador = 0;
    System.out.print("¿Java es un lenguaje de programación? ");
    String respuesta = s.next().toLowerCase();
    if (respuesta == "si" ) {
      System.out.print("Contador: " + contador);
    }
  }
}
    
