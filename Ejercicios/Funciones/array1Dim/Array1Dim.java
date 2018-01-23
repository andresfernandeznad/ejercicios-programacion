
package funciones.array1Dim;

/**
 *
 * @author andrésfernándeznadales
 */
public class Array1Dim {
  
  /**
* Muestra un array
*
* @param x un array
*/
  public static void mostrarArrayInt (int x []) {
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }
  }
  
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
  
  /**
* Busca un número en un array y devuelve la posición
* (el índice) en la que se encuentra.
*
* @param x un array de números enteros
* @param n un número entero
* @return Devuelve la posición del número en el array
*/
  public static int posicionEnArray (int x [], int n) {
    int posicion = 0;
    for (int i = 0; i < x.length; ++i) {
      if (x[i] == n) {
        posicion = i;
      }
    }
    return posicion;
  }
  
  /**
* Le da la vuelta a un array
*
* @param x un array de números enteros
*/
  public static void volteaArrayInt (int x []) {
    int [] copia = new int [x.length];
    int contador = 0;
    for (int i = x.length - 1; i >= 0; --i) {
      copia[contador] = x[i];
      ++contador;
    }
    for (int i = 0; i < copia.length; i++) {
      System.out.print(" " + copia[i]);
    }
  }
  
  /**
* Rota n posiciones a la derecha los números de
* un array.
*
* @param x un array de números enteros
* @param n número de posiciones que rota
* @return Devuelve el array rotado
*/
  public static int [] rotaDerechaArrayInt (int x [], int n) {
    int [] copia = new int [x.length + 1];
    int [] auxiliar = new int [x.length + 1];
    
    for (int i = 0; i < copia.length - 1; ++i) {
      copia[i] = x[i];
    }
    
    for (int i = 0; i < n; i++) {
      
      for (int j = 0; j < copia.length - 1; j++) {
        auxiliar[j + 1] = copia[j];                   //Aquí rota el array
        if (j + 1 == copia.length - 1) {
          auxiliar[0] = copia[copia.length - 2];
        }
      }
      
      for (int j = 0; j < copia.length; j++) {
        copia[j] = auxiliar[j];                       //Aquí se copia para luego al rotar de nuevo no machacar el valor
      }
    }
    
    return auxiliar;
  }
  
  /**
* Rota n posiciones a la izquierda los números de
* un array.
*
* @param x un array de números enteros
* @param n número de posiciones que rota
* @return Devuelve array rotado
*/
  public static int [] rotaIzquierdaArrayInt (int x [], int n) { 
    int [] copia = new int [x.length + 1];
    int [] auxiliar = new int [x.length + 1];
    
    for (int i = 0; i < copia.length - 1; ++i) {
      copia[i] = x[i];
    }
    
    for (int i = 0; i < n; i++) {
      for (int j = copia.length - 2; j >= 0; j--) {
        if (j - 1 == -1) {
          auxiliar[auxiliar.length - 2] = copia[0];     //Aquí rota el array
        } else {
        auxiliar[j - 1] = copia[j];
        }
      }
      
      for (int j = 0; j < copia.length; j++) {
        copia[j] = auxiliar[j];                         //Aquí se copia para luego al rotar de nuevo no machacar el valor
      }
    }
    return auxiliar;
  }
}
