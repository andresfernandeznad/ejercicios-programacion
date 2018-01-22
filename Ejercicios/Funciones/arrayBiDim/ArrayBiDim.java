
package funciones.arrayBiDim;

import funciones.array1Dim.Array1Dim;

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
  
  /**
* Devuelve la fila y la columna (en un array
* con dos elementos) de la primera ocurrencia de un número dentro de un
* array bidimensional. Si el número no se encuentra en el array, la función
* devuelve el array {-1, -1}.
*
* @param x un array
* @param numero es el número que buscamos en el array
* @return Devuelve la fila y la columna
*/
  public static int [] coordenadasEnArrayBiInt (int x [][], int numero) {
    int [] array = new int [2];
    array[0] = -1;
    array[1] = -1;
    
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        if (numero == x[i][j]) {
          array[0] = i;
          array[1] = j;
          return array;                 //Poniendo el return aquí acaba el la función porque devuelve un valor
        }
        
      }
    }
    return array;
  }
  
  /**
* Dice si un número es o no punto de silla, es decir,
* mínimo en su fila y máximo en su columna.
*
* @param x un array
* @param numero Número que queremos saber si es punto de silla
* @return Devuelve true si es punto de silla o false si no es punto de silla
*/
  public static boolean esPuntoDeSilla (int x [][], int numero) {
    boolean puntoSilla = false;
    int [] array = coordenadasEnArrayBiInt(x, numero);
    int [] fila = new int [x[0].length];
    int [] columna = new int [x.length];
    for (int i = 0; i < fila.length; i++) {
      fila[i] = x[array[0]][i];
    }
    for (int i = 0; i < columna.length; i++) {
      columna[i] = x[i][array[1]];
    }
    if ((numero == Array1Dim.minimoArrayInt(fila))&&(numero == Array1Dim.maximoArrayInt(columna))) {
      puntoSilla = true;
    }
    return puntoSilla;
  }
  
    /**
* Devuelve un array que contiene una de las diagonales del
* array bidimensional que se pasa como parámetro. Se pasan como
* parámetros fila, columna y dirección. La fila y la columna determinan
* el número que marcará las dos posibles diagonales dentro del array. La
* dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
* cadena “nose” indica que se elige la diagonal que va del noroeste hacia
* el sureste, mientras que la cadena “neso” indica que se elige la diagonal
* que va del noreste hacia el suroeste.
*
* @param x un array
* @param fila
* @param columna
* @param direccion Direccion de la diagonal
* @return Devuelve un array que contiene una de las diagonales
*/
  public static int [] diagonal (int x [][], int fila, int columna, String direccion) {
    int [] array = new int [x.length];
    int contador = 0;
    
    
    if (direccion.equals("nose")) {
      while ((fila > 0)&&(columna > 0)) {
        --fila;
        --columna;
      }
      while ((fila < x.length)&&(columna < x[0].length)) {
        array[contador] = x[fila][columna];
        contador++;
        ++fila;
        ++columna;
      }
    } else {
      while ((fila > 0)&&(columna < x[0].length)) {
        --fila;
        ++columna;
      }
      while ((fila < x.length)&&(columna >= 0)) {
        array[contador] = x[fila][columna];
        contador++;                                     
        ++fila;                                         
        --columna;
      }
    }
    return array;
  }
}
