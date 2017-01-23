public class Matrices {

  public static void main(String[] args){

    int[][] matriz = new int[3][4];

    int contador = 0;

    //Modi
    for(int i = 0; i < matriz.length; i++){

      for(int j = 0; j < matriz[1].length; j++){

        matriz[i][j] = contador;
        contador++;

      }

    }

    //Imprimir una matriz

    for(int i = 0; i < matriz.length; i++){

      for(int j = 0; j < matriz[1].length; j++){

        System.out.print(matriz[i][j]);

      }

      System.out.println();
    }


    //Otra forma de recorrer una matriz
    System.out.println();

    for(int[] arr : matriz){

      for(int valor : arr){

        System.out.print(valor);

      }

      System.out.println();

    }

    //System.out.println(matriz.length);
    //System.out.println(matriz[1].length);
  }
}
