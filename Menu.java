import java.util.Scanner;

public class Menu {

  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    int cobro = 0;
    int opcion_menu = 0;
    int opcion_platillo = 0;
    int opcion_bebida = 0;

    System.out.println("Menú");
    System.out.println("Elige el tiempo:");
    System.out.println("1. Desayuno");
    System.out.println("2. Comida");

    opcion_menu = entrada.nextInt();

    //Es desayuno

    if(opcion_menu == 1){

      System.out.println("Elige tu platillo:");
      System.out.println("1. Chilaquiles, incluye café o atole - $30");
      System.out.println("2. Tofu revuelto a la mexicana, incluye té - $25");

      opcion_platillo = entrada.nextInt();

      if(opcion_platillo == 1){

        System.out.println("¿Cambias tu café o atole por té?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        cobro = 30;

        opcion_bebida = entrada.nextInt();

        if(opcion_bebida == 1) {

          cobro = 35;

        }

        } else if(opcion_platillo == 2){

          System.out.println("¿Cambias tu té por café o atole?");
          System.out.println("1. Sí");
          System.out.println("2. No");
          cobro = 25;
          opcion_bebida = entrada.nextInt();

          if(opcion_bebida == 1) {

            cobro = 30;
            
        }
      }
    }

    System.out.println("Total a pagar " + cobro);

  }
}
