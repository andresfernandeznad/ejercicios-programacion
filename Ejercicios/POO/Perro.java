
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Perro extends Mamifero {

  public Perro() {
  }
  
  void ladrar() {
    System.out.println("Guau");
  }
  
  void morder(Perro perro1) {
    if (perro1.getSexo().equals("macho")) {
      System.out.println(this.getNombre() + " muerde.");
    } else {
      System.out.println(this.getNombre() + " no muerde.");
    }
  }
  
  /**
   * Recoger la pelota
   */
  void irPelota() {
    System.out.println(this.getNombre() + " coge la pelota.");
  }
}
