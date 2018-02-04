
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public abstract class Animal {
  //ATRIBUTOS////////////////////////////////
  
  private String nombre, sexo;
  private double peso;
  private int edad;
  
  //METODOS////////////////////////////////
  
  public Animal() {
    this.sexo = "macho";
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  /**
   * El animal camina
   */
  void camina() {
    System.out.println("El animal camina.");
  }
  
  /**
   * El animal come
   */
  void comer() {
    System.out.println("El animal se alimenta.");
  }
  
  /**
   * El animal bebe
   */
  void beber() {
    System.out.println("El animal bebe.");
  }
}
