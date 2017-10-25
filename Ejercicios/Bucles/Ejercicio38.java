/**Ejercicio38 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int altura = s.nextInt();
    int espacios = 1;
    while ((altura < 3)||((altura%2)==0)) {
      System.out.println("Introduzca la altura: ");
      altura = s.nextInt();
      int x = 0;
    }
    for (int i = 0; i < altura; ++i) {
      System.out.println();
      for (int j = 1; j < espacios; ++j) {
