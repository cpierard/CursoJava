import java.util.Scanner;
import java.util.Random;

public class PiedraPT {
	
	Scanner entrada = new Scanner(System.in);
	Scanner entrada2 = new Scanner(System.in);
	Random aleatorio = new Random();
	String nombre;

	int mano_computadora=0;
	int mano_usuario=0;
	

	public void inicio() {
		System.out.println("Bienvenido al juego de piedra papel o tijeras");
		System.out.println("Dime tu nombre para jugar");
		nombre=entrada.next();
		jugar();
	}

	public void jugar() {
		mano_computadora=aleatorio.nextInt(3);
		System.out.println("Dime tu tirada");
		System.out.print("0.piedra  ");
		System.out.print("1.papel ");
		System.out.print("2.tijeras ");
		System.out.println();
		mano_usuario=entrada2.nextInt();
		int r = comparaManos(mano_computadora, mano_usuario);
		if(r==0) {
			System.out.println("GANO LA computadora");
		} else if(r==1) {
			System.out.println("GANASTE " + nombre);
		} else {
			System.out.println("HUBO EMPATE");
		}
		System.out.println("Esto eligio la computadora " + mano_computadora);
	}

	public int comparaManos(int mc, int mu) {
		//El valor de 0 representa que gano 
		//la computadora
		int resultado=0;

		if(mc==mu) {
			resultado=2;
		} else {
			if(mc==0) {
				if(mu==1) {
					resultado=1;
				} 
			}
			if(mc==1) {
				if(mu==2) {
					resultado=1;
				}
			}
			if(mc==2) {
				if(mu==0) {
					resultado=1;
				} 
			}
		}
		return resultado;
	}//Fin del método comparaManos
}