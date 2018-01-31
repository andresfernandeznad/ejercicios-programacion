
package poo;

import java.util.Scanner;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Caballo rayo = new Caballo();
    
    rayo.setNombre("Rayo");
    rayo.setPeso(200);
    System.out.println("Hola como se llama el primer caballo?");
    System.out.println(rayo.getNombre());
    System.out.println("¿Qué te parece esta comida?");
    rayo.come("pasto");
    System.out.println("Y esta otra?");
    String comida = s.next();
    rayo.come(comida);
  }
  
}
