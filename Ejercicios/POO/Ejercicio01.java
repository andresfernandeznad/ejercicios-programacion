
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
    Caballo rocinante = new Caballo();
    rocinante.setSexo("macho");
    
    rayo.setNombre("Rayo");
    rayo.setPeso(200);
    System.out.println("Hola como se llama el primer caballo?");
    System.out.println(rayo.getNombre());
    System.out.println("¿Qué te parece esta comida?");
    rayo.come("pasto");
    System.out.println("Y esta otra?");
    String comida = s.next();
    rayo.come(comida);
    System.out.println(rayo);
    Caballo cria = rayo.aparearseCon(rocinante);
    System.out.println("Ponle un nombre a la cría: ");
    cria.setNombre("Cria1");
    System.out.println(cria.getNombre());
    
  }
  
}
