import java.util.Scanner;

public class Menu {
		
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int cobro=0;
		int opcion_menu=0;
		int opcion_platillo=0;
		int cambio=0;

		System.out.println("Tu menú es: ");
		System.out.println("1. Desayuno");
		System.out.println("2. Comida");
		opcion_menu=entrada.nextInt();
		//Es desayuno
		if(opcion_menu==1) {
			System.out.println("Elige tu platillo");
			System.out.println("1. Chilaquiles incluye café o atole - $30");
			System.out.println("2. Huevos con jamón incluye té - $20");
			opcion_platillo=entrada.nextInt();
			if(opcion_platillo==1) {
				cobro=30;
			} else {
				cobro=20;
				System.out.println("¿Cambias tu bebida de té por café o atole? - $25");
				System.out.println("1. Sí");
				System.out.println("2. No");
				cambio=entrada.nextInt();
				if(cambio==1) {
					cobro=25;
				}
			}
		}
		System.out.println("Total a pagar: " +  cobro);
	}		
}