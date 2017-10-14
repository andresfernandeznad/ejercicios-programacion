//Ejercicio23 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el precio base: ");
    double precioBase = s.nextDouble();
    System.out.print("Introduce el tipo de IVA aplicado(general, reducido y");
    System.out.print(" superreducido): ");
    String iva = s.next().toLowerCase();
    System.out.print("Introduce el código promocional(nopro, mitad, meno5 o 5porc): ");
    String promo = s.next().toLowerCase();
    System.out.print("Su base imponible: " + precioBase);
    if (iva.equals("general")) {
      double precioIva = (precioBase * 0.21) + precioBase;
      System.out.println("IVA 25% = " + (precioBase*0.21));
      System.out.println("Precio con IVA: " + precioIva);
      if (promo.equals("nopro")) {
        System.out.println("Su cod.promo(nopro): -0");
        System.out.println("Total: "+ precioIva);
      } else if (promo.equals("mitad")) {
        System.out.println("Su cod.promo(mitad): -" + (precioIva/2));
        System.out.println("Total: "+ precioIva/2);
      } else if (promo.equals("meno5")) {
        System.out.println("Su cod.promo(meno5): -5");
        System.out.println("Total: "+ (precioIva - 5));
      } else if (promo.equals("5porc")) {
        System.out.println("Su cod.promo(5porc): -" + ((precioIva*5)/100));
        System.out.println("Total: "+ (precioIva - ((precioIva*5)/100)));
      }
    } else if (iva.equals("reducido")) {
      double precioIva = (precioBase * 0.1) + precioBase;
      System.out.println("IVA 10% = " + (precioBase*0.1));
      System.out.println("Precio con IVA: " + precioIva);
      if (promo.equals("nopro")) {
        System.out.println("Su cod.promo(nopro): -0");
        System.out.println("Total: "+ precioIva);
      } else if (promo.equals("mitad")) {
        System.out.println("Su cod.promo(mitad): -" + (precioIva/2));
        System.out.println("Total: "+ precioIva/2);
      } else if (promo.equals("meno5")) {
        System.out.println("Su cod.promo(meno5): -5");
        System.out.println("Total: "+ (precioIva - 5));
      } else if (promo.equals("5porc")) {
        System.out.println("Su cod.promo(5porc): -" + ((precioIva*5)/100));
        System.out.println("Total: "+ (precioIva - ((precioIva*5)/100)));
      }
    } else if (iva.equals("superreducido")) {
      double precioIva = (precioBase * 0.04) + precioBase;
      System.out.println("IVA 4% = " + (precioBase*0.04));
      System.out.println("Precio con IVA: " + precioIva);
      if (promo.equals("nopro")) {
        System.out.println("Su cod.promo(nopro): -0");
        System.out.println("Total: "+ precioIva);
      } else if (promo.equals("mitad")) {
        System.out.println("Su cod.promo(mitad): -" + (precioIva/2));
        System.out.println("Total: "+ precioIva/2);
      } else if (promo.equals("meno5")) {
        System.out.println("Su cod.promo(meno5): -5");
        System.out.println("Total: "+ (precioIva - 5));
      } else if (promo.equals("5porc")) {
        System.out.println("Su cod.promo(5porc): -" + ((precioIva*5)/100));
        System.out.println("Total: "+ (precioIva - ((precioIva*5)/100)));
      }
    }
  }
}
        
