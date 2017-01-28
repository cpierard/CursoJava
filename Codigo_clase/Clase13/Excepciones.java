import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepciones {
	
	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);

		System.out.println("cadena");
		System.out.println("cadena");

		int a=1;
		int b=1;
		try {
			System.out.println(a/b);	
		} catch(ArithmeticException ae) {
			System.out.println("No hay divisiones entre cero!!");
		} 
		
		//Más instrucciones
		for(int i=0; i<5; i++) {
			System.out.println("Hola");
		}


		//manejo de excepcion en arreglo
		int[] arreglo = {1,2,3,4};

		try {
			int var=arreglo[100];
			System.out.println(var);
			System.out.println(5/0);
		} catch(ArrayIndexOutOfBoundsException rango_invalido) {
			System.out.println("Indice fuera de rango");
			System.out.println(rango_invalido);
		} catch(ArithmeticException ae) {
			System.out.println("No hay divisiones entre cero!!");
		}


		try {
			int c = entrada.nextInt();
			int d = entrada.nextInt();
			int res=c/d;
			System.out.println(res);
		} catch(InputMismatchException ime) {
			System.out.println("Lectura fallida");
		} catch(ArithmeticException ae) {
			System.out.println("División entre cero");
		} finally {
			System.out.println("MANEJE EXCEPCIONES");
		}



		


	}
}










