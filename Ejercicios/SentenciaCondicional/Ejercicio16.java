//Ejercicio16 de Sentencia Condicional

//@author Andrés Fernández Nadales

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int contador = 0;
    System.out.println("      Test de infidelidad, responde verdadero o falso");
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin");
    System.out.print(" ningún motivo aparente: ");
    String respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("2. Ha aumentado sus gastos de vestuario: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es ");
    System.out.print("hombre) o ahora se arregla el pelo y se asea con más ");
    System.out.print("frecuencia (si es mujer): ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("6. A veces tiene llamadas que dice no querer contestar ");
    System.out.print("cuando estás tú delante: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o ");
    System.out.print("estar bronceado/a: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("8. Muchos días viene tarde después de trabajar porque ");
    System.out.print("dice tener mucho más trabajo: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("9. Has notado que últimamente se perfuma más: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    System.out.print("10. Se confunde y te dice que ha estado en sitios ");
    System.out.print("donde no ha ido contigo: ");
    respuesta = s.next().toLowerCase();
    if (respuesta.equals("verdadero")) {
      contador = contador + 3;
    }
    if ((contador >= 0)&&(contador <= 10)) {
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    if ((contador >= 11)&&(contador <= 22)) {
      System.out.print("Quizás exista el peligro de otra persona en su vida");
      System.out.print(" o en su mente, aunque seguramente será algo sin ");
      System.out.print("importancia. No bajes la guardia.");
    }
    if ((contador >= 23)&&(contador <= 30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar");
      System.out.print(" viviendo un romance con otra persona. Te ");
      System.out.print("aconsejamos que indagues un poco más y averigües ");
      System.out.print("que es lo que está pasando por su cabeza.");
    }
  }
}
