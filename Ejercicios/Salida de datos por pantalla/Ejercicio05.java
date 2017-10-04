public class Ejercicio05 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.printf("%-10s %-8s  %-10s  %-10s", " ", "Lunes", "Martes", "Miércoles");
    System.out.printf("%-7s  Viernes\n", "Jueves");
    System.out.printf("%-10s -----------------------------------------------------\n", " ");
    System.out.printf(blanco + "%-4s   "  + rojo +  "%-10s" + azul + "%-10s", "8:15-9:15", "Progr", "Siste");
    System.out.printf(rojo+"%-10s" + naranja + "%-10s" + azul + "%-10s\n", "Progr", "Entor", "Siste");
    System.out.printf(blanco + "%-4s  "  + rojo +  "%-10s" + azul + "%-10s", "9:15-10:15", "Progr", "Siste");
    System.out.printf(rojo+"%-10s" + naranja + "%-10s" + azul + "%-10s\n", "Progr", "Entor", "Siste");
    System.out.printf(blanco + "%-4s "  + rojo +  "%-10s" + azul + "%-10s", "10:15-11:15", "Progr", "Siste");
    System.out.printf(rojo+"%-10s" + naranja + "%-10s" + azul + "%-10s\n", "Progr", "Entor", "Siste");
    System.out.printf(blanco + "%-4s "  + verde +  "%-10s" + morado + "%-10s", "11:45-12:45", "Bases", "Lengu");
    System.out.printf(verde + "%-10s" + morado + "%-10s" + blanco + "%-10s\n", "Bases", "Lengu", "Forma");
    System.out.printf(blanco + "%-4s "  + verde +  "%-10s" + rojo + "%-10s", "12:45-13:45", "Bases", "Progr");
    System.out.printf(verde + "%-10s" + morado + "%-10s" + blanco + "%-10s\n", "Bases", "Lengu", "Forma");
    System.out.printf(blanco + "%-4s "  + verde +  "%-10s" + rojo + "%-10s", "13:45-14:45", "Bases", "Progr");
    System.out.printf(verde + "%-10s" + morado + "%-10s" + blanco + "%-10s\n", "Bases", "Lengu", "Forma");
  }
}
