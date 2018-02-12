
package poo.Ejercicio02;

import java.util.Scanner;
/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Coche coche1 = new Coche(1234, "rojo", 0, "Ford");
    Bicicleta bici1 = new Bicicleta(12, "montaña", 0, "BH");
    int numero = 0;
    
    while (numero != 8) {
      System.out.println("Selecciona una opción: ");
      System.out.println("VEHÍCULOS");
      System.out.println("==========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8):");
      numero = s.nextInt();
      switch(numero) {
        case 1:
          System.out.print("Introduce cuanto quiere andar con la bici: ");
          int distancia = s.nextInt();
          bici1.andarBici(distancia);
          break;
        case 2:
          bici1.hacerCaballito();
          break;
        case 3:
          System.out.print("Introduce cuanto quiere andar con el coche: ");
          distancia = s.nextInt();
          coche1.andarCoche(distancia);
          break;
        case 4:
          coche1.quemarRueda();
          break;
        case 5:
          System.out.println(bici1.getKilometrosRecorridos());
          
          break;
        case 6:
          System.out.println(coche1.getKilometrosRecorridos());
          
          break;
        case 7:
          System.out.println(Vehiculo.getKilometrosTotales());
          break;
        case 8:
          
          break;
      }
    }
  }
  
}
