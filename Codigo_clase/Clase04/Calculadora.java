import java.util.Scanner;

public class Calculadora {
	
	Scanner entrada = new Scanner(System.in);

	//Metodo de suma 
	public int suma(int a, int b) {
		return a+b;
	}


	//Metodo multiplicacion
	public int multiplicacion(int a, int b) {
		return a*b;
	}


	//Metodo de resta
	public int resta(int a, int b) {
		int resultado=0;
		System.out.println("Valor de a " + a);
		System.out.println("Valor de b " + b);
		System.out.println("¿Qué quieres hacer");
		System.out.println("1. a-b");
		System.out.println("2. b-a");
		int opcion=entrada.nextInt();
		if(opcion==1) {
			resultado=a-b;
		} else {
			resultado=b-a;
		}
		return resultado;
	}

}
