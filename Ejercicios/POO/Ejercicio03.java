
package poo;

import java.util.Scanner;
/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Gato garfield = new Gato();
    Perro pipo = new Perro();
    Perro popi = new Perro();
    Pinguino pingu = new Pinguino();
    Canario canari = new Canario();
    Lagarto sneik = new Lagarto();
    canari.setNombre("Canari");
    
    sneik.setNombre("Sneik");
    System.out.println("Ven " + sneik.getNombre());
    sneik.camina();
    sneik.cazar(canari);
    
    garfield.setNombre("Garfield");
    System.out.println("Ven " + garfield.getNombre());
    garfield.camina();
    garfield.maullar();
    
    pipo.setNombre("Pipo");
    popi.setNombre("Popi");
    System.out.println("Pipo pelea con Popi!");
    pipo.morder(popi);
    
    
    System.out.println("Vuela " + canari.getNombre());
    canari.cantar();
    canari.volar();
    pingu.setNombre("Pingu");
    System.out.println("Ven " + pingu.getNombre() + " intenta volar: ");
    pingu.resbalar();
    System.out.println("Vuela " + pingu.getNombre());
    pingu.volar();
  }
  
}
