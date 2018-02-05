
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Canario extends Ave {

  public Canario() {
    
  }
  
  /**
   * Este canario canta
   */
  void cantar() {
    System.out.println("pipipipii");
  }
  
  /**
   * Este canario baila si es lo suficientemente mayor
   */
  void bailar() {
    if(this.getEdad() > 2) {
      System.out.println("Baile");
    } else if (this.getEdad() < 2) {
      System.out.println("Soy muy pequeño no se bailar.");
    }
  }
  
  /**
   * Hace piruetas
   */
  void hacerPiruetas() {
    System.out.println("Este canario hace piruetas.");
  }
}
