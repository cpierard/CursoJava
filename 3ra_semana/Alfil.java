import java.util.Scanner;

public class Alfil {

  public static void main(String[] args) {

    int[][] tablero = new int[8][8];
    Scanner entrada = new Scanner(System.in);
    int x = 0;
    int y = 0;

    System.out.println("Dame coordenadas alfil 0-7");

    System.out.print("x: ");
    x = entrada.nextInt();
    System.out.println();

    System.out.print("y: ");
    y = entrada.nextInt();
    System.out.println();

    //Primer cuadrante

    int i_c1 = x;
    int j_c1 = y;

    while(i_c1 >= 0 && j_c1 >= 0) {

      tablero[i_c1][j_c1] = 1;
      i_c1--;
      j_c1--;

    }

    //Segundo cuadrante

    int i_c2 = x;
    int j_c2 = y;

    while(i_c2 >= 0 && j_c2 <= 7) {

      tablero[i_c2][j_c2] = 1;
      i_c2--;
      j_c2++;

    }

    //Tercer cuadrante

    int i_c3 = x;
    int j_c3 = y;

    while(i_c3 <= 7 && j_c3 >= 0) {

      tablero[i_c3][j_c3] = 1;
      i_c3++;
      j_c3--;

    }

    //Cuarto cuadrante

    int i_c4 = x;
    int j_c4 = y;

    while(i_c4 <= 7 && j_c4 <= 7) {

      tablero[i_c4][j_c4] = 1;
      i_c4++;
      j_c4++;

    }

    tablero[x][y] = 2;

    for(int i = 0; i <tablero.length; i++) {

      for(int j = 0; j<tablero[1].length; j++) {

        if (tablero[i][j] == 0) {

          System.out.print("- ");

        } else if(tablero[i][j] == 1) {

          System.out.print("* ");

        } else {

          System.out.print("\u265D ");

        }

      }

      System.out.println();
    }

  }
}
