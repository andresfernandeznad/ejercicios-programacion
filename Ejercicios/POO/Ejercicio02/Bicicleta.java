
package poo.Ejercicio02;

/**
 *
 * @author andrésfernándeznadales
 */
public class Bicicleta extends Vehiculo {
  
  private int codigo = 0;
  private String tipo = "";

  public Bicicleta(int codigo, String tipo, int distancia, String marca) {
    this.codigo = codigo;
    this.tipo = tipo;
    this.kilometrosRecorridos = distancia;
    this.marca = marca;
    ++vehiculosCreados;
    kilometrosTotales += distancia;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  
  
  public void andarBici(int distancia) {
    System.out.println("Su bici anda: " + distancia + " kilómetros.");
    this.kilometrosRecorridos += distancia;
    kilometrosTotales += distancia;
  }
  
  public void hacerCaballito() {
    System.out.println("Su bici hace el caballito.");
  }
  
  
  
}
