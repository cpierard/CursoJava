import java.util.Random;

public class MayorMejorado {
	
	public static void main(String[] args) {

		Random aleatorios = new Random();
		int valor=0;

		int[] arreglo = new int[10];
		//Llenamos el arreglo de valores al azar
		for(int i=0; i<arreglo.length; i++) {
			valor=aleatorios.nextInt(100)+1;
			arreglo[i]=valor;
		} 

		System.out.println("Elementos en el arreglo");
		for(int i=0; i<arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		} 

		
		System.out.println();
		
		int mayor=arreglo[0];
		int menor=arreglo[0];
		for(int i=1; i<arreglo.length; i++) {
			if(arreglo[i]>mayor) {
				mayor=arreglo[i];
			}
			if(arreglo[i]<menor) {
				menor=arreglo[i];
			}
		} 
		System.out.println("El mayor es: ");
		System.out.println(mayor);
		System.out.println("El menor es: ");
		System.out.println(menor);
	}
}








