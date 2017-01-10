import java.util.Scanner;

public class ParImpar {

  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    int numero = 0;

    System.out.println("Ingresa un número, para saber si es par o impar");
    numero = entrada.nextInt();

    if(numero % 2 == 0){

      System.out.println("Par");

    } else if(numero % 2 == 1){

      System.out.println("Impar");

    }

  }
}
