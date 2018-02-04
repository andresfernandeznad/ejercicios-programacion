
package poo;

/**
 *
 * @author andresillo
 */
public abstract class Mamifero extends Animal {

  public Mamifero() {
  }
  
  void tenerCrias() {
    System.out.println("Este mamífero tiene una cría.");
  }
  
  void amamantar() {
    System.out.println("Este animal amamanta.");
  }
}
