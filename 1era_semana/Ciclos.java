public class Ciclos {

  public static void main(String[] args) {

    /* Programa que calcula e imprime los números pares
    e impares de 1 a 1000.*/

    int i = 1;

    while(i <= 1000) {

      if(i % 2 == 0){

        System.out.println(i + " es par.");

      } else if(i % 2 == 1) {

        System.out.println(i + " es impar");

      }

      i++;

    }
  }
}
