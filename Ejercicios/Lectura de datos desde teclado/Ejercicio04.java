//Ejercicio04 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio04 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduzca un número: ");
    double primerNumero;
    linea = System.console().readLine();
    primerNumero = Double.parseDouble(linea);
    System.out.print("Introduzca otro número: ");
    double segundoNumero;
    linea = System.console().readLine();
    segundoNumero = Double.parseDouble(linea);
    double multiplicacion;
    double suma;
    double resta;
    double division;
    suma = primerNumero + segundoNumero;
    resta = primerNumero - segundoNumero;
    multiplicacion = primerNumero * segundoNumero;
    division = primerNumero / segundoNumero;
    System.out.print("El resultado de la suma es: ");
    System.out.println(suma);
    System.out.print("El resultado de la resta es: ");
    System.out.println(resta);
    System.out.printf("El resultado de la multiplicación es: %.2f\n",
     multiplicacion);
    System.out.printf("El resultado de la división es: %.2f\n", division);
  }
}
