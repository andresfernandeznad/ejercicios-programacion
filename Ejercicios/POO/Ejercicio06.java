
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    Tiempo tiempo1 = new Tiempo(5,40,50);
    Tiempo tiempo2 = new Tiempo(3,30,16);
    Tiempo tiempoFinal = tiempo1.suma(tiempo2);
    System.out.println(tiempoFinal);
    tiempoFinal = tiempo1.resta(tiempo2);
    System.out.println(tiempoFinal);
  }
  
}
