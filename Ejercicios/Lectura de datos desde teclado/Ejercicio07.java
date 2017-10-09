//Ejercicio07 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio07 {
  public static void main(String[] args){
    System.out.print("Introduce el coste total de la factura: ");
    String linea;
    linea = System.console().readLine();
    int factura = Integer.parseInt(linea);
    double costeIva = ((double)factura * 0.21);
    double costeFinal = (double)factura + costeIva;
    System.out.printf("Su factura con IVA es: %.2f", costeFinal);
  }
}
