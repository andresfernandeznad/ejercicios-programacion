
package poo;

/**
 *
 * @author andresillo
 */
public abstract class Ave extends Animal {
  
  private String plumaje;
  
  public Ave() {
    this.plumaje = "blanco";
  }

  public String getPlumaje() {
    return plumaje;
  }

  public void setPlumaje(String plumaje) {
    this.plumaje = plumaje;
  }
  
  void plumaje() {
    System.out.println("Su plumaje es: " + this.getPlumaje());
  }
  
  void tenerHuevos() {
    System.out.println("Este mamífero tiene"+ (int)(Math.random()*5)+1 + "cría.");
  }
  
  void volar() {
    System.out.println("Este ave vuela.");
  }
}
