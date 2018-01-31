
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Caballo {
  
  //ATRIBUTOS////////////////////////////////
  
  private String nombre, raza, sexo;
  private double peso;
  private int edad;
  
  //METODOS////////////////////////////////

  public Caballo() {
    this.sexo = "hembra";
  }
  
  public Caballo (int numero) {
    this.peso = numero;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return this.raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getSexo() {
    return this.sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  
  
  /**
   * El caballo relincha
   */
  void relincha() {
    System.out.println("El caballo relincha");
  }
  
  /**
   * El caballo come
   */
  void come(String comida) {
    if (comida.equals("pasto")) {
      System.out.println("Qué bueno!");
    } else {
      System.out.println("Esta comida no me gusta!");
    }
    
  }
}
