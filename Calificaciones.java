import java.util.Scanner;

public class Calificaciones {

  public static void main(String[] args) {

    /*
    Bloque de comentario

    Programa que dada una calificación de un alumnoda un mensaje */

    Scanner entrada = new Scanner(System.in);

    double calificacion = 0; //El float con un solo decimal es double.

    System.out.println("Escribe la calificación del alumno");

    calificacion = entrada.nextDouble();

    if(calificacion >= 0 && calificacion <= 10) {

      if(calificacion == 10) {

        System.out.println("Excelente");

      } else if(calificacion < 10 && calificacion >= 9) {

        System.out.println("Muy bien");

      } else if(calificacion < 9 && calificacion >= 8) {

        System.out.println("Bien");

      } else if(calificacion < 8 && calificacion >= 7) {

        System.out.println("Regular");

      } else if(calificacion < 7 && calificacion >= 6) {

        System.out.println("Ya que...");

      } else {

        System.out.println("MAL");
      }

    } else {

      System.out.println("Calificación inválida");

    }
  }
}
