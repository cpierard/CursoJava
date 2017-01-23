public class Promedios {

  public static void mian(String[] args) {

    int[][] tabla = {{7,8,9,5}, {10,10,9,9}, {5, 6, 7, 10}, {5,6,10, 8}};

    int[] promedios = new int[tabla.length];
    double prom = 0.0;
    double mayor;

    for(int[] alumno : tabla){

      for(int nota : alumno)

        prom += (double) nota;

    }

    prom = (double) prom / alumno.length;
    promedios[alumno] = prom;
    prom = 0;

    mayor = promedios[0];
    for(int j : promedios){


      System.out.println(j);

      if(j > mayor){

        mayor = j;

      }

    }

    System.out.println();
    System.out.println("El mayor promedio es " + mayor);

  }

}
