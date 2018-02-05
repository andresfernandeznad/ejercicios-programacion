
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Pinguino extends Ave {

  public Pinguino() {
  }
  
  @Override
  void volar() {
    System.out.println("No se volar :(");
  }
  
  /**
   * El pinguino baila.
   */
  void bailar() {
    System.out.println("Este pinguino baila.");
  }
  
  void resbalar() {
    System.out.println("El pinguino se resbala.");
  }
}
