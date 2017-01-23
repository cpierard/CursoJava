public class BubbleSort {

   	public static void main(String[] args) {

      int[] arreglo={4,2,7,8,90,12,0,2,13,55};

      int longitud=arreglo.length-1;
      int i;
      int temporal=0;
      while(longitud>0) {
      	i=0;
      	while(i<longitud) {
      		if(arreglo[i]>arreglo[i+1]) {
      			temporal=arreglo[i];
      			arreglo[i]=arreglo[i+1];
      			arreglo[i+1]=temporal;

      		}
      		i++;
      	}
      	longitud--;
      }

      for(int val: arreglo) {
      	System.out.print(val + " ");
      }
      System.out.println();

   }
}

