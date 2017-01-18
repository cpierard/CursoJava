import java.util.Scanner;

public class Piramide {

  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    int n = 0;

    System.out.println("Dame un valor de n para generar un triángulo");

    n = entrada.nextInt();
    int columna = 1;

    if(n >= 0) {

      for(int i = 1; i <= n ; i++) {

        for(int j = 1; j <= columna; j++){

          System.out.print("*");

        }

        columna++;
        System.out.println();

      }
    }

  }
}
