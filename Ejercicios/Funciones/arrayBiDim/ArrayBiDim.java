
package funciones.arrayBiDim;

/**
 *
 * @author andresfernándeznadales
 */
public class ArrayBiDim {
  
    
  /**
* Muestra un array
*
* @param x un array
*/
  public static void mostrarArrayBiInt (int x [][]) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; ++j) { //Longitud de una fila del array
        System.out.printf("%4d ", x[i][j]);
      }
      System.out.println();
    }
  }
  
  /**
* Genera un array de tamaño n con números aleatorios
* cuyo intervalo (mínimo y máximo) se indica como parámetro.
*
* @param m un número entero positivo
* @param n un número entero positivo
* @param minimo un número entero positivo
* @param maximo un número entero positivo
* @return Devuelve un array
*/
  public static int [][] generaArrayBiInt (int n, int m, int minimo, int maximo) {
    int [][] array = new int [n][m];
    
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        array[i][j] = (int)(Math.random()*(maximo - minimo)) + minimo;
      }
    }
    
    return array;
    
  }
  
  /**
* Devuelve la fila i-ésima del array que se pasa como
* parámetro.
*
* @param x un array
* @param fila es la fila que queremos devolver
* @return Devuelve una fila del array
*/
  public static int [] filaDeArrayBiInt (int x [][], int fila) {
    int [] array = new int [x[0].length];
    for (int i = 0; i < array.length; i++) {
      array[i] = x[fila][i];
    }
    return array;
  }
  
  /**
* Devuelve la fila i-ésima del array que se pasa como
* parámetro.
*
* @param x un array
* @param columna es la columna que queremos devolver
* @return Devuelve una columna del array
*/
  public static int [] columnaDeArrayBiInt (int x [][], int columna) {
    int [] array = new int [x.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = x[i][columna];
    }
    return array;
  }
}
