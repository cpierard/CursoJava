import java.util.Random;

public class Aleatorios {

  public static void main(String[] args) {

    Random alea = new Random();

    int x = alea.nextInt(50) + 1;

    System.out.println("Salió " + x);

  }
}
