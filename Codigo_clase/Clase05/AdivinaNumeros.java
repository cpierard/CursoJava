import java.util.Scanner;
import java.util.Random;

public class AdivinaNumeros {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();

		int posibilidades=5;
		int numero_secreto=0;
		numero_secreto=aleatorios.nextInt(100)+1;
		int respuesta=0;
		boolean ganador=false;

		while(posibilidades>=1) {
			System.out.println("Trata de adivinar un número entre 1 y 100");
			System.out.println("Tienes " +  posibilidades + " intentos de adivinar");
			respuesta=entrada.nextInt();
			if(numero_secreto>respuesta) {
				System.out.println("Mi número es mayor al tuyo, da uno más grande");
			} else if(numero_secreto<respuesta) {
				System.out.println("Mi número es menor, da uno más pequeño ");
			} else {
				System.out.println("Adivinaste!!");
				posibilidades=0;
				ganador=true;

			}
			posibilidades--;
		}

		if(ganador==false) {
			System.out.println("Perdiste :(");
		}

		System.out.println("El número era " +  numero_secreto);

	}

}





