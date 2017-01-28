import java.util.Scanner;
import java.util.Random;

public class Memorama {

  Random alea = new Random();
  Scanner entrada = new Scanner(System.in);


  int[][] memorama = {{0,0,1,1},{2,2,3,3},{4,4,5,5},{6,6,7,7}};
  boolean[][] adivinados = new boolean[4][4];

  public void barajear() {

    int pos1;
    int pos2;
    int temporal = 0;

    for(int i = 0; i <= memorama.length - 1; i++) {
      for(int j = 0; j <= memorama[i].length - 1; j++) {

        pos1 = alea.nextInt(4);
        pos2 = alea.nextInt(4);

        temporal = memorama[i][j];

        memorama[i][j] = memorama[pos1][pos2];
        memorama[pos1][pos2] = temporal;

      }
    }
  }

  public void imprimeTableroProgramador() {

    for(int[] val : memorama) {
      for(int elem : val){

        System.out.print(elem + " ");

      }

      System.out.println();

    }
  }

  public void imprimeTableroJugador() {

    for(int i = 0; i < memorama.length; i++) {
      for(int j = 0; j < memorama[1].length; j++){

        if(memorama[i][j] == 0) {

          System.out.print("\u2F64 ");

        }else if(memorama[i][j] == 1) {

          System.out.print("\u2F63 ");

        } else if(memorama[i][j] == 2) {

          System.out.print("\u2F65 ");

        } else if(memorama[i][j] == 3) {

          System.out.print("\u2F66 ");

        } else if(memorama[i][j] == 4) {

          System.out.print("\u2F67 ");

        } else if(memorama[i][j] == 5) {

          System.out.print("\u2F68 ");

        } else if(memorama[i][j] == 6) {

          System.out.print("\u2F69 ");

        } else if(memorama[i][j] == 7) {

          System.out.print("\u2F70 ");

        }

      }

      System.out.println();

    }
  }

  public void imprimeTableroJuegoActivo() {
		int valor=0;
		for (int i=0; i<adivinados.length; i++) {
			for(int j=0; j<adivinados[i].length; j++) {
				if(adivinados[i][j]==false) {
					System.out.print("- ");
				} else {
					valor=memorama[i][j];
					if(valor==0) {
						System.out.print("\u2600" + " ");
					} else if(valor==1) {
						System.out.print("\u260E" + " ");
					} else if(valor==2) {
						System.out.print("\u2665" + " ");
					} else if(valor==3) {
						System.out.print("\u2656" + " ");
					} else if(valor==4) {
						System.out.print("\u263A" + " ");
					} else if(valor==5) {
						System.out.print("\u266A" + " ");
					} else if(valor==6) {
						System.out.print("\u2663" + " ");
					} else {
						System.out.print("\u263E" + " ");
					}

				}
			}
			System.out.println();
		}
	}

  public void jugar() {
    barajar();

    int contador=1;
    int i=0;
    int j=0;
    int i_2=0;
    int j_2=0;
    while(contador<=3){
      imprimeTableroJuegoActivo();
      System.out.println("Dime que carta quieres mostrar i-> 0-3 , j-> 0-3 ");
      System.out.print("i: ");
      i=entrada.nextInt();
      System.out.println();
      System.out.print("j: ");
      j=entrada.nextInt();
      adivinados[i][j]=true;
      imprimeTableroJuegoActivo();
      System.out.println("Dime que otra carta quieres mostrar i-> 0-3 , j-> 0-3 ");
      System.out.print("i: ");
      i_2=entrada.nextInt();
      System.out.println();
      System.out.print("j: ");
      j_2=entrada.nextInt();
      adivinados[i_2][j_2]=true;
      imprimeTableroJuegoActivo();
      if(memorama[i][j]==memorama[i_2][j_2]) {
        adivinados[i][j]=true;
        adivinados[i_2][j_2]=true;
      } else {
        adivinados[i][j]=false;
        adivinados[i_2][j_2]=false;
      }

      contador++;
    }
  }

}
