public class Primos {

  public static void main(String[] args) {

    //int rango = 10;

    int i = 2;
    int temp = 0;
    int num = 1;
    int contador = 0;

    while(i <= 100){

      contador = 0;
      num = i;
      temp = 1;

      while(temp <= num){

        if(num % temp == 0){

          contador += 1;

        }
        temp += 1;
      }

      if(contador == 2){

        System.out.println(i + " es primo");

      }

      i++;

    }
  }
}
