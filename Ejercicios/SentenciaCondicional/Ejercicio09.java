//Ejercicio09 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa resolverá una ecuación del tipo: ax²+bx+c=0");
    System.out.print("Introduce el valor de a: ");
    double a = s.nextDouble();
    System.out.print("Introduce el valor de b: ");
    double b = s.nextDouble();
    System.out.print("Introduce el valor de c: ");
    double c = s.nextDouble();
    double x;
    if ((a==0)&&(b != 0)) {
      x = (-c)/b;
      System.out.print("El resultado de su ecuación es: "+ x);
    }
    if ((b == 0)&&(c <= 0)&&(a > 0)) {
      x = Math.sqrt (-c/a);
      System.out.print("El resultado de su ecuación es: "+ x);
    }
    if ((b == 0)&&(c >= 0)&&(a < 0)) {
      x = Math.sqrt (-c/a);
      System.out.print("El resultado de su ecuación es: "+ x);
    }
    if ((b == 0)&&(a == 0)) {
      System.out.print("El resultado de su ecuación no existe.");
    }
    if ((c == 0)&&(a != 0)) {
      x = (-b)/a;
      System.out.print("Su ecuación tendría dos resultados: x = 0 y x ="+x);
    }
    if ((c==0)&&(a == 0)) {
      System.out.print("Su ecuación tendría dos resultados: x = 0 e indeterminación");
    }
    if ((b*b) < (4*a*c)) {
      System.out.print("Raiz cuadrada negativa por tanto no se puede resolver");
    }
    if ((a != 0)&&(b != 0)&&(c !=0)&&((b*b) < (4*a*c))) {
    x = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
    System.out.print("El resultado de x es = " + x);
    x = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
    System.out.print(" y x = " + x);
    }
  }
}
