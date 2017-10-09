//Ejercicio09 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio09 {
  public static void main(String[] args){
    System.out.print("Introduce la áltura del cono: ");
    String linea;
    linea = System.console().readLine();
    int altura = Integer.parseInt(linea);
    System.out.print("Ahora introduce el radio del cono: ");
    linea = System.console().readLine();
    int radio = Integer.parseInt(linea);
    double volumen = (3.1416 * radio * radio * altura)/3;
    System.out.printf("Su volumen es: %.2f", volumen);
  }
}
