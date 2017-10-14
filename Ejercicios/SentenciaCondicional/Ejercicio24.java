//Ejercicio24 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el cargo del empleado(1-3): ");
    System.out.println("1 - Prog.Junior.");
    System.out.println("2 - Prog.Senior.");
    System.out.println("3.- Jefe de proyecto.");
    int cargo = s.nextInt();
    System.out.print("Introduce los días que has estado en casas de clientes");
    System.out.print(" este mes: ");
    int dias = s.nextInt();
    System.out.println("Introduce su estado civil(1-2): ");
    System.out.println("1 - Soltero.");
    System.out.println("2 - Casado.");
    int codCivil = s.nextInt();
    if (cargo == 1) {
      System.out.println("Sueldo base: 950.");
      System.out.println("Dietas: " + dias*30);
      System.out.println("Sueldo bruto: "+ ((dias*30)+950));
      if (codCivil == 1) {
        System.out.println("Retención (IRPF): " + (((dias*30)+950)*25)/100);
        System.out.println("Sueldo neto: "+ (((dias*30)+950) - (((dias*30)+950)*25)/100));
      } else if (codCivil == 2) {
        System.out.println("Retención (IRPF): " + (((dias*30)+950)*20)/100);
        System.out.println("Sueldo neto: "+ (((dias*30)+950)-(((dias*30)+950)*20)/100));
      }
    } else if (cargo == 2) {
      System.out.println("Sueldo base: 1200.");
      System.out.println("Dietas: " + dias*30);
      System.out.println("Sueldo bruto: "+ ((dias*30)+1200));
      if (codCivil == 1) {
        System.out.println("Retención (IRPF): " + (((dias*30)+1200)*25)/100);
        System.out.println("Sueldo neto: "+ (((dias*30)+1200)-(((dias*30)+1200)*25)/100));
      } else if (codCivil == 2) {
        System.out.println("Retención (IRPF): " + (((dias*30)+1200)*20)/100);
        System.out.println("Sueldo neto: "+ (((dias*30)+1200)-(((dias*30)+1200)*20)/100));
      }
    } else if (cargo == 3) {
      System.out.println("Sueldo base: 1600.");
      System.out.println("Dietas: " + dias*30);
      System.out.println("Sueldo bruto: "+ ((dias*30)+1600));
      if (codCivil == 1) {
        System.out.println("Retención (IRPF): " + (((dias*30)+1600)*25)/100);
        System.out.println("Sueldo neto: "+ (((dias*30)+1600)-(((dias*30)+1600)*25)/100));
      } else if (codCivil == 2) {
        System.out.println("Retención (IRPF): " + (((dias*30)+1600)*20)/100);
        System.out.println("Sueldo neto: "+ (((dias*30)+1600)-(((dias*30)+1600)*20)/100));
      }
    }
  }
}
