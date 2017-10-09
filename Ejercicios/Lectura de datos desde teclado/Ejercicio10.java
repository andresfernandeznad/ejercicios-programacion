//Ejercicio10 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio10 {
  public static void main(String[] args){
    System.out.print("Escribe la cantidad de Mb que deseas convertir: ");
    String linea;
    linea = System.console().readLine();
    int mb = Integer.parseInt(linea);
    int kb = mb * 1024;
    System.out.printf("Sus Mbs son: %d kbs", kb);
  }
}
    
