/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonetbeans;

/**
 *
 * @author andresfernandeznadales
 */

import java.util.Scanner;


public class ProyectoNetBeans {

  
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int posicion = 0;
    int caracter = 0;
    System.out.print("Introduzca la longitud del sendero: ");
    int longitud = s.nextInt();
    int posicionFinal = 12;
    
    for (int i = 1; i <= longitud; i++) {
      posicion = (int)(Math.random() * 3) - 1;
      posicionFinal += posicion;
      for (int j = 0; j < posicionFinal; ++j) {
          System.out.print(" ");
        }
     System.out.print("#");
     caracter = 0;
      for (int x = 0; x < 4; ++x) {
       
         if ((caracter != 2)&&(caracter != 3)) {
          caracter = (int)(Math.random()*4);
         switch (caracter) {
           case 0:
             System.out.print(" ");
             break;
           case 1:
             System.out.print(" ");
             break;
           case 2:
             System.out.print("*");
             break;
           case 3:
             System.out.print("o");
             break;
         }
         
       } else {
           System.out.print(" ");
         }
      }
     System.out.println("#");
    }
  }
}


  
