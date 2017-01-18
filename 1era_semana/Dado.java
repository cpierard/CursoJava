import java.util.Random;

public class Dado {

  public static void main(String[] args) {

    Random alea = new Random();

    int dado = alea.nextInt(6) + 1;

    //System.out.println("Valor del dado  " + dado);

    int i = 1;
    int cara_1 = 0;
    int cara_2= 0;
    int cara_3 = 0;
    int cara_4 = 0;
    int cara_5 = 0;
    int cara_6 = 0;

    while(i <= 100) {

      dado = alea.nextInt(6) + 1;
      //System.out.println("Valor del dado  " + dado);
      i++;

      if(dado == 1) {

        cara_1++;

      } else if(dado == 2) {

        cara_2++;

      } else if(dado == 3){

        cara_3++;

      } else if(dado == 4){

        cara_4++;

      }else if(dado == 5){

        cara_5++;

      }else if(dado == 6){

        cara_6++;

      }

    }

    System.out.println("Cara 1: " + cara_1);
    System.out.println("Cara 2: " + cara_2);
    System.out.println("Cara 3: " + cara_3);
    System.out.println("Cara 4: " + cara_4);
    System.out.println("Cara 5: " + cara_5);
    System.out.println("Cara 6: " + cara_6);

  }
}
