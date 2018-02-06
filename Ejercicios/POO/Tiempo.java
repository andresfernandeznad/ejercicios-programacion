
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Tiempo {
  //ATRIBUTOS////////////////////////
  private int horas;
  private int minutos;
  private int segundos;
  
  //MÉTODOS/////////////////////////

  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  @Override
  public String toString() {
    String resultado = "";
    resultado += ("" + this.horas + "h " + this.minutos + "m " + this.segundos + "s.");
    return resultado;
  }
  
  /**
   * Suma tiempos
   * @param tiempo1
   * @return Devuelve el tiempo final
   */
  public Tiempo suma(Tiempo tiempo1) {
    int contador = 0;
    Tiempo resultado = new Tiempo(0, 0, 0);
    resultado.segundos = this.segundos + tiempo1.segundos;
    while (resultado.segundos > 60) {
      resultado.segundos -= 60;
      ++contador;
      
    }
    
    
    resultado.minutos = this.minutos + tiempo1.minutos;
    resultado.minutos += contador;
    contador = 0;
    while (resultado.minutos > 60) {
      resultado.minutos -= 60;
      contador++;
    }
    resultado.horas = this.horas + tiempo1.horas;
    resultado.horas += contador;
    return resultado;
  }
  
  /**
   * Resta tiempos, hay que poner en orden correcto
   * @param tiempo1
   * @return Devuelve el tiempo final
   */
  public Tiempo resta(Tiempo tiempo1) {
    Tiempo resultado = new Tiempo(0, 0, 0);
    resultado.horas = this.horas - tiempo1.horas;
    
    resultado.minutos = this.minutos - tiempo1.minutos;
    resultado.segundos = this.segundos - tiempo1.segundos;
    
    return resultado;
  }
}
