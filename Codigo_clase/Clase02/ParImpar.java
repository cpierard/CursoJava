import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero=0;
		System.out.println("Escribe un número para saber si es par o impar");
		numero=entrada.nextInt();
		if(numero%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
}