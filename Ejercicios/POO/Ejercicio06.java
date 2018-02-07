
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    Tiempo tiempo1 = new Tiempo(5,40,50);
    Tiempo tiempo2 = new Tiempo(3,30,16);
    System.out.println("La suma entre: ");
    System.out.println(tiempo1 + " y " + tiempo2 + " es ");
    Tiempo tiempoFinal = tiempo1.suma(tiempo2);
    System.out.println(tiempoFinal);
    System.out.println("La resta entre: ");
    System.out.println(tiempo1 + " y " + tiempo2 + " es ");
    tiempoFinal = tiempo1.resta(tiempo2);
    System.out.println(tiempoFinal);
  }
  
}
