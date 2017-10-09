//Ejercicio12 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio12 {
  public static void main(String[] args){
    
    System.out.print("Introduce la nota del primer examen: ");
    String linea = System.console().readLine();
    double primeraNota = Double.parseDouble(linea);
    
    System.out.print("Introduce la nota deseada al final de trimestre: ");
    linea = System.console().readLine();
    double notaTrimestral = Double.parseDouble(linea);
    
    double segundaNota;
    segundaNota = (notaTrimestral * 1 - primeraNota * 0.4)/0.6;
    
    System.out.printf("La nota necesaria para sacar %.2f en el trimestre",
    notaTrimestral);
    System.out.printf(" es: %.2f en el segundo examen", segundaNota);
  }
}
