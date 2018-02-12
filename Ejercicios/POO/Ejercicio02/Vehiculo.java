
package poo.Ejercicio02;

/**
 *
 * @author andrésfernándeznadales
 */
public abstract class Vehiculo {
  //ATRIBUTOS DE CLASE//////////////////////////
  
  protected static int vehiculosCreados = 0;
  protected static int kilometrosTotales = 0;
  //ATRIBUTOS DE INSTANCIA/////////////////////
  protected String marca = "";
  protected int kilometrosRecorridos = 0;
  //METODOS DE INSTANCIA//////////////////////
  
  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
}
