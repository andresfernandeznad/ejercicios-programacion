
package poo;

/**
 *
 * @author andrésfernándeznadales
 */
public class Fraccion {
  //ATRIBUTOS////////////////////////
  
  private int numerador, denominador;
  
  //METODOS//////////////////////////

  public Fraccion() {
  }

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
  
  /**
   * Este método pinta x fracción
   */
  void pintar() {
    System.out.println(this.numerador);
    System.out.println("━━━");
    System.out.println(this.denominador);
  }
  
  /**
   * Este método invierte
   */
  void invertir(int numerador,int denominador) {
    numerador = this.numerador;
    denominador = this.denominador;
    System.out.println(denominador);
    System.out.println("___");
    System.out.println(numerador);
  }
  
  /**
   * Simplifica la fracción
   */
  void simplifica(int numero, int numerador, int denominador) {
    numerador = this.numerador;
    denominador = this.denominador;
    
    while ((numerador > 0)&&(denominador > 0)&&(numerador % numero == 0)&&(numerador % numero == 0)) {
      numerador /= numero;
      denominador /= numero;
    }
    System.out.println(numerador);
    System.out.println("___");
    System.out.println(denominador);
  }
  
  /**
   * Multiplica fracciones
   */
  void multiplica(Fraccion fraccion2) {
    int numerador = 0;
    int denominador = 0;
    
    numerador = this.getNumerador() * fraccion2.getNumerador();
    denominador = this.getDenominador() * fraccion2.getDenominador();
     System.out.println(numerador);
    System.out.println("___");
    System.out.println(denominador);
  }
  
  /**
   * Divide fracciones
   */
  void divide(Fraccion fraccion2) {
    int numerador = 0;
    int denominador = 0;
    
    numerador = this.getNumerador() * fraccion2.getDenominador();
    denominador = this.getDenominador() * fraccion2.getNumerador();
     System.out.println(numerador);
    System.out.println("___");
    System.out.println(denominador);
  }
}
