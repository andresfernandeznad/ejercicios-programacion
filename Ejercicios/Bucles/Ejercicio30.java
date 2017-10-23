/**Ejercicio30 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio30 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la hora del primer día: ");
    int primeraHora = s.nextInt();
    System.out.print("Introduce el día de la semana (1-7): ");
    int primerDia = s.nextInt();
    System.out.print("Introduce la hora del segundo día: ");
    int segundaHora = s.nextInt();
    System.out.print("Introduce el día de la semana (1-7): ");
    int segundoDia = s.nextInt();
    while ((primeraHora < 1)||(primeraHora > 23)) {
      System.out.print("Introduce la hora del primer día: ");
      primeraHora = s.nextInt();
    }
    while ((primerDia < 1)||(primerDia > 6)||(primerDia > segundoDia)) {
      System.out.print("Introduce el día de la semana (1-7): ");
      primerDia = s.nextInt();
    }
    while ((segundaHora < 1)||(segundaHora > 23)) {
      System.out.print("Introduce la hora del segundo día: ");
      segundaHora = s.nextInt();
    }
    while ((segundoDia < 1)||(segundoDia > 7)||(primerDia > segundoDia)) {
      System.out.print("Introduce el día de la semana (1-7): ");
      segundoDia = s.nextInt();
    }
    System.out.print("Hay: " +
    -(((primerDia - segundoDia)*24) + (primeraHora - segundaHora)) + 
    " horas de diferencia.");
  }
}
