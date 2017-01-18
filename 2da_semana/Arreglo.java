public  class Arreglo {

  public static void main(String[] args) {

    //Declaracion de un arreglo
    boolean[] arr = new boolean[10];
    arr[3] = true;
    for(int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + " ");

    }

    System.out.println("\n");

    int[] arr2 = {1,2,3,4,5,6};

    for(int i = 0; i < arr2.length; i++) {

      System.out.print(arr2[i] + " ");

    }

  }
}
