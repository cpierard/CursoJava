import java.util.Scanner;
import java.util.Random;

public class Juego {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random alea = new Random();

		String secreta="";
		String respuesta;
		String temporal;
		int numero=0;
		boolean ganador=true;

		int contador=1;
		while(contador<=8) {
			numero=alea.nextInt(10);
			temporal=Integer.toString(numero);
			secreta+=temporal;
			System.out.println(secreta);
			System.out.println("Escribe tu respuesta");
			respuesta=entrada.next();
			if(secreta.equals(respuesta)==false) {
				System.out.println("PERDISTE");
				ganador=false;
				contador=10;

			}
			contador++;
		}

		if(ganador) {
			System.out.println("GANASTE");
		}


	}
}
