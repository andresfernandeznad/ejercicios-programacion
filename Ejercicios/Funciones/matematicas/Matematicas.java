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
}
