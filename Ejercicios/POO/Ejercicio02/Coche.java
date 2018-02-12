
package poo.Ejercicio02;

/**
 *
 * @author andrésfernándeznadales
 */
public class Coche extends Vehiculo {
  
  private int matricula = 0;
  private String color = "";

  public Coche(int matri, String color, int distancia,String marca) {
    this.matricula = matri;
    this.color = color;
    this.kilometrosRecorridos = distancia;
    this.marca = marca;
    ++vehiculosCreados;
    kilometrosTotales += distancia;
  }
  
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public void andarCoche(int distancia) {
    System.out.println("Su coche anda: " + distancia + " kilómetros.");
    this.kilometrosRecorridos += distancia;
    kilometrosTotales += distancia;    
  }
  
  public void quemarRueda() {
    System.out.println("Su coche quema ruedas.");
  }
}
