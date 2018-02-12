
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Pizza {
  private String tamanyo;
  private String tipo;
  private String estado = "pedida";
  private static int pedidas = 0;
  private static int servidas = 0;

  public Pizza(String tamanyo, String tipo) {
    this.tamanyo = tamanyo;
    this.tipo = tipo;
    this.estado = "pedida";
    pedidas++;
  }

  public String getTamanyo() {
    return tamanyo;
  }

  public void setTamanyo(String tamanyo) {
    this.tamanyo = tamanyo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public static int getPedidas() {
    return pedidas;
  }

  public static void setPedidas(int pedidas) {
    Pizza.pedidas = pedidas;
  }

  public static int getServidas() {
    return servidas;
  }

  public static void setServidas(int servidas) {
    Pizza.servidas = servidas;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  public void sirve () {
    if (this.estado.equals("pedida")) {
      this.setEstado("servida");
      ++servidas;
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }

  @Override
  public String toString() {
    return "Pizza " + this.getTamanyo() + ", " + this.getTipo() + ", " +  this.getEstado();
  }
  
  
}
