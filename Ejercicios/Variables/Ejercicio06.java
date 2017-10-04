//Ejercicio06 del tema Variables

//@author Andrés Fernández Nadales

public class Ejercicio06 {
  public static void main(String[] args) {
    int baseImponible = 200;
    double Iva = 0.21;
    double impuesto = (double)baseImponible*Iva;
    System.out.print("El precio de la factura sin IVA es " + baseImponible); 
    System.out.print(" y el precio con IVA es ");
    System.out.print(((double)baseImponible + impuesto));
  }
}
