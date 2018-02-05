
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Lagarto extends Animal {

  public Lagarto() {
  }
  
  void tomarSol() {
    System.out.println("El lagarto toma el sol");
  }
  
  /**
   * El lagarto intenta cazar un canario
   * @param canario 
   */
  void cazar(Canario canario) {
    int random = (int)(Math.random()*2);
    if (random == 0) {
      System.out.println(this.getNombre() + " consigue cazar a " + canario.getNombre());
    } else {
      System.out.println(this.getNombre() + " no consigue cazar a " + canario.getNombre());
    }
  }
  
  /**
   * El lagarto intenta hablar
   */
  void hablar() {
    System.out.println("Los lagartos no saben hablar.");
  }
}

