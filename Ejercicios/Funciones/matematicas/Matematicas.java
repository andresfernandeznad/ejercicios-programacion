/*
 * Funciones matemáticas
 * 
 * @author Andrés Fernández Nadales
 */
package funciones.matematicas;

/**
 *
 * @author andresillo
 */
public class Matematicas {

  /**
* Da la vuelta a un número.
*
* @param x un número entero positivo
* @return <code>X volteado</code>
*/
  public static int voltea(int x) {
    int volteado = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }
  //SOBRECARGA
  public static long voltea(long x) {
    return voltea((int)x);
  }
    /**
* Comprueba si un número es capicua.
*
* @param x un número entero positivo
* @return <code>True</code>  si el número es capicuo
* @return <code>False</code> si el número no es capicuo
*/
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
  /**
* Comprueba si un número entero positivo es primo o no.
* Un número es primo cuando únicamente es divisible entre
* él mismo y la unidad.
*
* @param x un número entero positivo
* @return <code>true</code> si el número es primo
* @return <code>false</code> en caso contrario
*/
  public static boolean esPrimo (int x) {
    for (int i = 2; i < x; ++i) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
  /**
* Comprueba si un número entero positivo es primo o no.
* Va aumentando el valor si no es primo hasta encontrar el siguiente primo.
*
* @param x un número entero positivo
* @return Devuelve el próximo primo.
*/ 
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
  /**
* Calcula la potencia de un número.
*
* @param x, base.
* @param y, exponente.
* @return Devuelve la potencia.
*/ 
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
  /**
* Cuenta el número de dígitos de un número.
*
* @param x un número entero.
* @return Devuelve la cantidad de dígitos.
*/ 
  public static int digitos (int x) {
    int contador = 0;
    while (x > 0) {
      x /= 10;
      ++contador;
    }
    return contador;
  }
  /**
* Devuelve el dígito que está en la posición n de un número
* entero. Se empieza contando por el 0 y de izquierda a derecha.
*
* @param x un número entero.
* @param y Posición de la que queremos sacar el dígito
* @return Devuelve el dígito de x en la posición y.
*/
  public static int digitoN (int x, int y) {
    int volteado = funciones.matematicas.Matematicas.voltea(x);
    int solu = volteado % 10;
    
    for (int i = 0; i < y; i++) {
      volteado /= 10;
      solu = volteado % 10;
    }
    return solu;
  }
  /**
* Le quita a un número n dígitos por detrás (por la
* derecha).
*
* @param x un número entero.
* @param y Cantidad de número que queremos quitar.
* @return Devuelve el número con los dígitos quitados.
*/
  public static int quitaPorDetras (int x, int y) {
    for (int i = 0; i < y; i++) {
      x /= 10;
    }
    return x;
  }
  /**
* Le quita a un número n dígitos por detrás (por la
* izquierda).
*
* @param x un número entero.
* @param y Cantidad de número que queremos quitar.
* @return Devuelve el número con los dígitos quitados.
*/
  public static int quitaPorDelante (int x, int y) {
    int volteado = funciones.matematicas.Matematicas.voltea(x);
    x = funciones.matematicas.Matematicas.quitaPorDetras(volteado, y);
    x = funciones.matematicas.Matematicas.voltea(x);
    return x;
  }
  /**
* Añade un dígito por detrás a un número
*
* @param x un número entero.
* @param y Dígito que queremos añadir.
* @return Devuelve el número con los dígitos añadidos.
*/
  public static int pegaPorDetras (int x, int y) {
    x *= 10;
    int ultimo = x + y;
    return ultimo;
  }
  /**
* Añade un dígito por delante a un número
*
* @param x un número entero.
* @param y Dígito que queremos añadir.
* @return Devuelve el número con los dígitos añadidos.
*/
  public static int pegaPorDelante (int x, int y) {
    int volteado = funciones.matematicas.Matematicas.voltea(x);
    x = funciones.matematicas.Matematicas.pegaPorDetras(volteado, y);
    x = funciones.matematicas.Matematicas.voltea(x);
    return x;
  }
  /**
* Da la posición de la primera ocurrencia de un dígito
* dentro de un número entero. Si no se encuentra, devuelve -1.
*
* @param x un número entero.
* @param y Dígito que queremos encontrar
* @return Devuelve la posición del número solicitado
* @return Devuelve -1 en caso erróneo.
*/
  public static int posicionDeDigito (int x, int y) {
    x = Matematicas.voltea(x);
    boolean encontrado = false;
    int resto;
    int contador = 0;
    while ((x > 0)&&(encontrado == false)) {
      resto = x % 10;
      if (resto == y) {
        
        encontrado = true;
      }
      contador++;
      x /= 10;
    }
    contador--;
    if (encontrado == false) {
      return -1;
    } else {
      return contador;
    }
  }
  
  /**
* Toma como parámetros las posiciones inicial y final
* dentro de un número y devuelve el trozo correspondiente.
*
* @param x la posición inicial
* @param y la posición final
* @param numero el número en si.
* @return Devuelve el trozo conseguido.
*/
  public static int trozoDeNumero (int x, int y, int numero) {
    numero = Matematicas.voltea(numero);
    for (int i = 0; i < x; ++i) {
      numero /= 10;
    }
    numero = Matematicas.voltea(numero);
    for (int i = 0; i < y; ++i) {
      numero /= 10;
    }
    return numero;
  }
  
  /**
* Pega dos números para formar uno.
*
* @param x Primer número
* @param y segundo número
* @return Devuelve el nuevo número juntado.
*/
  public static int juntaNumeros (int x, int y) {
    int longitud = Matematicas.digitos(x);
    x *= Matematicas.potencia(10, longitud);
    return x + y;
  }
  
  /**
* Pasa un número de base decimal a base binaria
*
* @param numero: número que queremos pasar a binario
* @return Devuelve el número en binario
*/
  public static int binario (int numero) {
    int binario = 0;
    int contador = 0;
    int copia = numero;
    while (numero % 2 == 0) {
      contador++;
      numero /= 2;
    }
    
    while (copia > 0) {
      
      binario = (copia % 2) + binario * 10;
      copia /= 2;
    }
    binario = Matematicas.voltea(binario);
    for (int i = 0; i < contador; ++i) {
      binario *= 10;
    }
    return binario;
  }
  
  /**
* Pasa un número de base binaria a base decimal
*
* @param numero: número que queremos pasar a decimal
* @return Devuelve el número en decimal.
*/
  public static int decimal (int numero) {
    int suma = 0;
    
    int copia = numero;
    int resto = 0;
    for (int i = 0; i < Matematicas.digitos(copia); ++i) {
      resto = numero % 10;
      
      suma += ((Matematicas.potencia(2, i)) * resto);
      numero /= 10;
    }
    return suma;
  }
  /**
* Pasa un número de base decimal a base octal
*
* @param numero: número que queremos pasar a octal
* @return Devuelve el número en octal.
*/ 
  public static int octal(int numero) {
    int resto = 0;
          int octal = 0;
          while (numero > 0) {
            resto = numero % 8;
            octal = resto + (octal * 10);
            numero /= 8;
          }
          return Matematicas.voltea(octal);
  }
  /**
* Pasa un número de base octal a base decimal
*
* @param numero: número que queremos pasar a decimal
* @return Devuelve el número en decimal.
*/ 
  public static int octalDec (int numero) {
    int suma = 0;
    
    int copia = numero;
    int resto = 0;
    for (int i = 0; i < Matematicas.digitos(copia); ++i) {
      resto = numero % 10;
      
      suma += ((Matematicas.potencia(8, i)) * resto);
      numero /= 10;
    }
    return suma;
  }
    /**
* Pasa un número de base hexadecimal a base decimal
*
* @param numero: número que queremos pasar a decimal
* @return Devuelve el número en decimal.
*/ 
  public static int hexaDec (int numero) {
    int suma = 0;
    
    int copia = numero;
    int resto = 0;
    for (int i = 0; i < Matematicas.digitos(copia); ++i) {
      resto = numero % 10;
      
      suma += ((Matematicas.potencia(16, i)) * resto);
      numero /= 10;
    }
    return suma;
  }
  
    /**
* Pasa un número de base decimal a base hexadecimal
*
* @param numero: número que queremos pasar a hexadecimal
* @return Devuelve el número en hexadecimal.
*/ 
  public static String hexadecimal(int numero) {
    int resto = 0;
    String [] fin = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};
          String hexadecimal = "";
          String numeroFinal = "";
          int i = 0;
          while (numero > 0) {
            resto = numero % 16;
            while (i < resto) {
              ++i;
            }
            hexadecimal += fin[i];
            numero /= 16;
            i = 0;
          }
          for (int j = hexadecimal.length() - 1; j>=0; --j) {
            numeroFinal = numeroFinal + hexadecimal.charAt(j);
          }
          return numeroFinal;
  }
}



  

