/**Ejercicio03 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int palo;
    int numero;
    numero = (int)((Math.random() * 10));
    switch (numero) {
      case 0:
        System.out.print("Su carta es AS de ");
        break;
      case 1:
        System.out.print("Su carta es 2 de ");
        break;
      case 2:
        System.out.print("Su carta es 3 de ");
        break;
      case 3:
        System.out.print("Su carta es 4 de ");
        break;
      case 4:
        System.out.print("Su carta es 5 de ");
        break;
      case 5:
        System.out.print("Su carta es 6 de ");
        break;
      case 6:
        System.out.print("Su carta es 7 de ");
        break;
      case 7:
        System.out.print("Su carta es sota de ");
        break;
      case 8:
        System.out.print("Su carta es caballo de ");
        break;
      case 9:
        System.out.print("Su carta es rey de ");
        break;
    }
    palo = (int)(Math.random() * 4);
    switch (palo) {
      case 0:
        System.out.print("espadas.");
        break;
      case 1:
        System.out.print("copas.");
        break;
      case 2:
        System.out.print("monedas.");
        break;
      case 3:
        System.out.print("palos.");
        break;
    }
  }
}
