
package poo;
import java.util.Scanner;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int valor = 0;
    int cantidad = 0;
    String zona = "";
    Zonas vip = new Zonas(25);
    Zonas compraVenta = new Zonas(200);
    Zonas principal = new Zonas(1000);
    while (valor != 3) {
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      valor = s.nextInt();
      switch (valor) {
        case 1:
          System.out.println("Quedan disponibles en Vip: " + vip.getEntradasPorVender());
          System.out.println("Quedan disponibles en compra-venta: " + compraVenta.getEntradasPorVender());
          System.out.println("Quedan disponibles en principal: " + principal.getEntradasPorVender());
          break;
        case 2:
          System.out.println("¿Qué zona quieres la entrada?");
          System.out.println("vip, compraventa o principal");
          
          zona = s.next();
          System.out.println("Que cantidad quiere?");
          cantidad = s.nextInt();
          if (zona.equals("vip")) {
            vip.vender(cantidad);
          } else if (zona.equals("compraventa")) {
            compraVenta.vender(cantidad);
          } else if (zona.equals("principal")) {
            principal.vender(cantidad);
          }
          break;
      }
    }
  }
  
}
