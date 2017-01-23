import java.util.Random;

public class DadoArreglo {

  public static void main(String[] args) {

    Random alea = new Random();

    int var_dado = alea.nextInt(6) + 1;

    int[] caras = new int[6];

    caras[0] = alea.nextInt(6) + 1;

    int contador = 1;

    while(contador <= 10000){

      var_dado = alea.nextInt(6) + 1;

      switch(var_dado) {
        case 1:
          caras[0]++;
          break;
        case 2:
          caras[1]++;
          break;
        case 3:
          caras[2]++;
          break;
        case 4:
          caras[3]++;
          break;
        case 5:
          caras[4]++;
          break;
        case 6:
          caras[5]++;
          break;
      }

      contador++;

    }

    /*for(int i=0; i < caras.length; i++) {
			System.out.println(i + 1 + ": " + caras[i]);
		}*/

    int i=1;
    for(int v : caras) {

      System.out.println(i + ": " + v);
      i++;

    }

  }
}
