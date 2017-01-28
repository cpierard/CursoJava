import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	
	String[] posibilidades = {"COCODRILO", "PERRO", "OSO", "RATON", "CABALLO", "RANA", "CUERVO", "GATO", "IGUANA", "POLLO", "FOCA", "JIRAFA", "KOALA"};
	Random alea = new Random();
	Scanner entrada = new Scanner(System.in);

	public void jugar() {
		int palabra=alea.nextInt(posibilidades.length);
		int cantidad=posibilidades[palabra].length();
		String[] pregunta= new String[cantidad];
		//Llenamos el arreglo con las letras de la palabra
		//que haya sido seleccionada
		for(int i=0; i<cantidad; i++) {
			char c = posibilidades[palabra].charAt(i);
			String cad = Character.toString(c);
			pregunta[i]=cad;
		}
		boolean[] aciertos = new boolean[cantidad]; 
		/*for(String s : pregunta) {
			System.out.print(s + " ");
		}*/
		System.out.println("");
		int vidas=0;
		String opcion;
		boolean adivino=false;
		while(vidas<=5) {
			adivino=false;
			imprimeArreglo(aciertos, pregunta);
			System.out.println("ADIVINA EL NOMBRE DE UN ANIMAL");
			System.out.println("Dame una letra A-Z");
			opcion=entrada.next();
			for(int i=0; i<pregunta.length; i++) {
				if(pregunta[i].equals(opcion)) {
					aciertos[i]=true;
					adivino=true;
				}
			}
			if(adivino==false) {
				vidas++;
			}
			imprimeMuneco(vidas, pregunta);
			if(revisaVictoria(aciertos)) {
				System.out.println("VICTORIA");
				break;
			}
		}
	}

	public boolean revisaVictoria(boolean[] arreglo) {
		boolean terminado=true;
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i]==false) {
				terminado=false;
			}
		}
		return terminado;
	}

	public void imprimeArreglo(boolean[] arr, String[] arr2) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==false) {
				System.out.print(" _ ");
			} else {
				System.out.print(arr2[i]);
			}
		}
		System.out.println("");
	}

	public void imprimeMuneco(int n, String[] p) {
		switch(n) {
			case 1:
				System.out.println("O");
				break;
			case 2:
				System.out.println("O");
				System.out.println("|");
				break;
			case 3:
				System.out.println(" O");
				System.out.println("/|");
				break;
			case 4:
				System.out.println(" O");
				System.out.println("/|\\ ");
				break;
			case 5:
				System.out.println(" O");
				System.out.println("/|\\ ");
				System.out.println("/ ");
				break;
			case 6:
				System.out.println(" O");
				System.out.println("/|\\ ");
				System.out.println("/ \\ ");
				System.out.println("La palabra era ");
				for(String s : p) {
					System.out.print(s + " ");
				}
				System.out.println();
				break;
		}
	}
}