//Ejercicio22 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el día de la semana: ");
    String dia = s.next().toLowerCase();
    System.out.print("Introduce la hora de ese día y minutos: ");
    int hora = s.nextInt();
    int minuto = s.nextInt();
    if (dia.equals("lunes")) {
      if (hora < 15) {
        hora = (15 - hora) + (24*4);
        hora = hora * 60;
        
        
