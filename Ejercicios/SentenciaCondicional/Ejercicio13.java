//Ejercicio13 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce tres números separados por un espacio: ");
    double n1 = s.nextDouble();
    double n2 = s.nextDouble();
    double n3 = s.nextDouble();
    if (( n1 < n2)&&(n1 < n3)) {
      System.out.print(n1+ ", ");
      if (n2 < n3) {
        System.out.print(n2+ ", " + n3);
      } else {
       System.out.print(n3+ ", " + n2);
      }
    }
    if (( n2 < n1)&&(n2 < n3)) {
      System.out.print(n2+ ", ");
      if (n1 < n3) {
        System.out.print(n1+ ", " + n3);
      } else {
       System.out.print(n3+ ", " + n1);
      }
    }
    if (( n3 < n2)&&(n3 < n1)) {
      System.out.print(n3+ ", ");
      if (n2 < n1) {
        System.out.print(n2+ ", " + n1);
      } else {
       System.out.print(n1+ ", " + n2);
      }
    }
  }
}
    
