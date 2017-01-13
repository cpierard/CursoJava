import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

  Scanner entrada = new Scanner(System.in);
  Scanner entrada2 = new Scanner(System.in);
  Random aleatorio = new Random();
  int mano_computadora = 0;
  int mano_usuario = 0;
  String nombre;


  public void inicio() {

    System.out.println("Piedra, papel o tijera");
    System.out.println("Dime tu nombre");

    nombre = entrada.next();
    jugar();

  }

  public void jugar() {

    mano_computadora = aleatorio.nextInt(3);

    System.out.println("¿Piedra, papel o tijera?");
    System.out.println("0. Piedra");
    System.out.println("1. Papel");
    System.out.println("2. Tijeras");

    mano_usuario = entrada2.nextInt();

    System.out.println("Computadora: " + mano_computadora);
    System.out.println("Tú elección:" + mano_usuario);

    comparaManos(mano_computadora, mano_usuario);

  }

  public void comparaManos(int mc, int mu) {

    if(mc == mu){

      System.out.println("Empate");

    } else {

      if(mc == 1){

        if(mu == 0) {

          System.out.println("Gana la computadora");

        } else {

          System.out.println("Ganaste tu " + nombre);

        }


      } else if(mc == 2) {

        if(mu == 1) {

          System.out.println("Gana la computadora");

        } else {

          System.out.println("Ganaste tu " + nombre);

        }

      } else {

        if(mu == 2) {

          System.out.println("Gana la computadora");

        } else {

          System.out.println("Ganaste tu " + nombre);

        }

      }
    }
  }
}
