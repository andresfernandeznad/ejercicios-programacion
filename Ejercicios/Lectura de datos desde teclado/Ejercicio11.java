//Ejercicio11 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio11 {
  public static void main(String[] args){
    System.out.print("Introduce la cantidad de Kbs que quieres convertir: ");
    String linea;
    linea = System.console().readLine();
    int kbs = Integer.parseInt(linea);
    double mbs = kbs / 1024;
    System.out.printf("Sus kbs son: %.2f mbs", mbs);
  }
}
