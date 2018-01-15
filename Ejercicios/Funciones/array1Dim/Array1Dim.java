
package funciones.array1Dim;

/**
 *
 * @author andrésfernándeznadales
 */
public class Array1Dim {
  /**
* Genera un array de tamaño n con números aleatorios
* cuyo intervalo (mínimo y máximo) se indica como parámetro.
*
* @param x un número entero positivo
* @param minimo un número entero positivo
* @param maximo un número entero positivo
* @return Devuelve un array
*/
  public static int [] generaArrayInt (int x, int minimo, int maximo) {
    int [] array = new int [x];
    
    for (int i = 0; i < array.length; ++i) {
      array[i] = (int)(Math.random()*(maximo - minimo)) + minimo;
    }
    for (int i = 0; i < array.length; ++i) {
      System.out.print(array[i] + " ");
    }
    return array;
    
  }
  /**
* Devuelve el máximo del array que se pasa como
* parámetro.
*
* @param x un array de números enteros
* @return El valor máximo del array
*/
  public static int maximoArrayInt (int x []) {
    int maximo = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] > maximo) {
        maximo = x[i];
      }
    }
    return maximo;
  }
  
  /**
* Devuelve el mínimo del array que se pasa como
* parámetro.
*
* @param x un array de números enteros
* @return El valor mínimo del array
*/
  public static int minimoArrayInt (int x []) {
    int minimo = maximoArrayInt(x);
    for (int i = 0; i < x.length; i++) {
      if (x[i] < minimo) {
        minimo = x[i];
      }
    }
    return minimo;
  }
  /**
* Devuelve la media del array que se pasa como parámetro.
*
* @param x un array de números enteros
* @return La media de los valores del array
*/
  public static double mediaArrayInt (int x []) {
    double media = 0;
    for (int i = 0; i < x.length; ++i) {
      media += x[i];
    }
    return media/x.length;
  }
  
  /**
* Dice si un número está o no dentro del array
*
* @param x un array de números enteros
* @param n un número entero
* @return <code>true</code> En el caso de que esté
* @return <code>false</code> En el caso de que no esté
*/
  public static boolean estaEnArrayInt (int x [], int n) {
    boolean esta = false;
    for (int i = 0; i < x.length; ++i) {
      if (x[i] == n) {
        esta = true;
      }
    }
    return esta;
  }
}
