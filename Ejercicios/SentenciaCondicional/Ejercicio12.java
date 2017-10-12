//Ejercicio12 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Preguntas tipo test, responde con si o no: ");
    int contador = 0;
    System.out.print("¿Java es un lenguaje de programación? ");
    String respuesta = s.next().toLowerCase();
    if (respuesta.equals("si") ) {
      contador = contador + 1;
    }
    System.out.print("¿Java es más antiguo que C? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("no") ) {
      contador = contador + 1;
    }
    System.out.print("¿Hacemos los estilos con HTML? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("no") ) {
      contador = contador + 1;
    }
    System.out.print("¿Linux es gratis? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("si") ) {
      contador = contador + 1;
    }
    System.out.print("¿Windows es de pago? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("si") ) {
      contador = contador + 1;
    }
    System.out.print("¿La memoria ram está hecha del mismo material que la GPU? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("no") ) {
      contador = contador + 1;
    }
    System.out.print("¿Que una base de datos sea integra implica que no tenga errores? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("si") ) {
      contador = contador + 1;
    }
    System.out.print("¿Usamos MySQL en BBDD? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("si") ) {
      contador = contador + 1;
    }
    System.out.print("¿Unix es predecesor de Linux? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("si") ) {
      contador = contador + 1;
    }
    System.out.print("¿Para crear un directorio escribimos mkdir? ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("si") ) {
      contador = contador + 1;
    }
    System.out.print("Has sacado un: " + contador);
  }
}
    
