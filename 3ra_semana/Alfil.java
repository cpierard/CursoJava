import java.util.Scanner;

public class Alfil {

  public static void main(String[] args) {

    int[][] tablero = new int[8][8];
    Scanner entrada = new Scanner(System.in);
    System.out.println("Dame las coordenadas 'x' y 'y' donde vas a
    colocar el alfil");

    System.out.print("x: ");
    int x = entrada.nextInt();
    System.out.println();

    System.out.print("y: ");
    int y = entrada.nextInt();
    System.out.println();

  }
}
