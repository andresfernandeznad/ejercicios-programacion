/*
 * Funciones matemáticas
 * 
 * @author Andrés Fernández Nadales
 */
package matematicas;

/**
 *
 * @author andresillo
 */
public class Matematicas {

 
  public static int voltea(int x) {
    int volteado = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }
  
  public static boolean esCapicua(int x) {
    int copia = x;
    int volteado = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    if (volteado == copia) {
      return true;
    } else {
      return false;
    }
  }
  
  public static boolean esPrimo (int x) {
    for (int i = 2; i < x; ++i) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static int siguientePrimo (int x) {
    boolean esPrimo = false;
    while (esPrimo == false) {
      int j = 2;
      while ((x % j) != 0) {
        ++j;
      }
      if (j == x) {
        
        esPrimo = true;
      }
      ++x;
    }
    return (x - 1);
  }
  
  public static int potencia (int x, int y) {
    int potencia;
    if (y == 0) {
      potencia = 1;
    } else {  
      potencia = x;
      for (int i = 0; i < y - 1; i++) {
        potencia *= x;
      }
    }
    return potencia;
    
  }
  
  public static int digitos (int x) {
    int contador = 0;
    while (x > 0) {
      x /= 10;
      ++contador;
    }
    return contador;
  }
  
  public static int digitoN (int x, int y) {
    int volteado = matematicas.Matematicas.voltea(x);
    int solu = volteado % 10;
    
    for (int i = 0; i < y; i++) {
      volteado /= 10;
      solu = volteado % 10;
    }
    return solu;
  }
  
  public static int quitaPorDetras (int x, int y) {
    for (int i = 0; i < y; i++) {
      x /= 10;
    }
    return x;
  }
  public static int quitaPorDelante (int x, int y) {
    int volteado = matematicas.Matematicas.voltea(x);
    x = matematicas.Matematicas.quitaPorDetras(volteado, y);
    x = matematicas.Matematicas.voltea(x);
    return x;
  }
}
