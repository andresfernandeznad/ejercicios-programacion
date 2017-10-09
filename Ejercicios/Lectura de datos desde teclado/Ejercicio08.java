//Ejercicio08 de lectura de datos desde teclado

//@author Andrés Fernández Nadales

public class Ejercicio08 {
  public static void main(String[] args){
    int salarioHora = 12;
    System.out.print("Introduce las horas a la semana que ha trabajado: ");
    String linea;
    linea = System.console().readLine();
    int horas = Integer.parseInt(linea);
    int salarioSemanal = horas * salarioHora;
    System.out.printf("Su empleado ha trabajado: %d horas. ", horas);
    System.out.printf("Y por lo tanto ha cobrado: %d euros esta semana"
    , salarioSemanal);
  }
}
