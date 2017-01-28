import java.util.Scanner;

public class Aerolinea implements VendeBoletosAvion {
	
	Scanner entrada = new Scanner(System.in);
	Scanner entrada2 = new Scanner(System.in);
	String destino="";
	String nombre_pasajero="";
	String numero_pasaporte="";
	boolean nacional=true;

	public void pideNombreDestino() {
		System.out.println("Escribe el lugar al que viajas");
		destino = entrada.nextLine();
	}

	public void pideDatosPasajeroInternacional() {
		nacional=false;
		System.out.println("El vuelo va a ser internacional");
		System.out.println("Escribe el nombre del pasajero");
		nombre_pasajero=entrada.nextLine();
		System.out.println("Escribe numero de pasaporte");
		numero_pasaporte=entrada.next();
	}

	public void pideDatosPasajeroNacional() {
		System.out.println("El vuelo va a ser nacional");
		System.out.println("Escribe el nombre del pasajero");
		nombre_pasajero=entrada.nextLine();
	}

	public boolean esNacional() {
		System.out.println("El vuelo es nacional");
		System.out.println("1. Sí");
		System.out.println("2. No");
		int r = entrada2.nextInt();
		if(r==2) {
			nacional=false;
		} 
		return nacional;
	}

	public void imprimeBoleto() {
		if(nacional) {
			System.out.println("**********************");
			System.out.println("PASAJERO: " + nombre_pasajero);
			System.out.println("DESTINO: " + destino);
			System.out.println("**********************");
			System.out.println("***  BUEN VIAJE  ***");
			System.out.println("**********************");
		} else {
			System.out.println("**********************");
			System.out.println("PASAJERO: " + nombre_pasajero);
			System.out.println("DESTINO: " + destino);
			System.out.println("PASAPORTE: " + numero_pasaporte);
			System.out.println("**********************");
			System.out.println("***  BUEN VIAJE  ***");
			System.out.println("**********************");
		}
	}
}