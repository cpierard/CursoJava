import java.util.Scanner;
import java.util.Random;

public class AdivinaNumeros {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    Random aleatorios = new Random();

    int posibilidades = 5;
    int numero_secreto = 0;
    int respuesta = 0;
    boolean ganador = false;
    numero_secreto = aleatorios.nextInt(100) + 1;

    System.out.println("Trata de adivinar un número entra 1 y 100");

    while(posibilidades >= 1){

      System.out.println("Tienes " + posibilidades + " intentos de adivinar. Dame un número:");

      respuesta = entrada.nextInt();

      if(numero_secreto > respuesta){

        System.out.println("El número es mayor a " + respuesta);

      } else if(numero_secreto < respuesta) {

        System.out.println("El número es menor a " + respuesta);

      } else {

        System.out.println("¡Adivinaste!");
        posibilidades = 0;
        ganador = true;

      }

      posibilidades--;
      System.out.println();

    }

    if(ganador == false){

      System.out.println("Perdiste...");
    }
    System.out.println("El número era " + numero_secreto);


  }
}
