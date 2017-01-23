import java.util.Scanner;

public class Vitrina {
	
	Pastel[] vitrina = new Pastel[5];
	Scanner entrada = new Scanner(System.in);
	Scanner entrada2 = new Scanner(System.in);
	Scanner entrada3 = new Scanner(System.in);


	public void menu() {
		//Pastel p1 = new Pastel("chocolate",25.50,1);
		//vitrina[0]=p1;
		int opcion=0;
		do {
			System.out.println("Selecciona una opcion");
			System.out.println("1. Ver todos los pasteles");
			System.out.println("2. Buscar pastel por sabor");
			System.out.println("3. Buscar pastel por precio");
			System.out.println("4. Buscar pastel por número de pisos");
			System.out.println("5. Tirar pastel");
			System.out.println("6. Tirar todos los pasteles");
			System.out.println("7. Guardar pastel");
			System.out.println("8. Salir");
			opcion=entrada.nextInt();
			leeOpcion(opcion);
		} while(opcion!=8);
	}

	public void leeOpcion(int op) {
		switch(op) {
			case 1:
				verTodos();
				break;
			case 2:
				buscaPastelSabor();
				break;
			case 3:
				buscaPastelPrecio();
				break;
			case 4:
				buscaPastelPisos();
				break;
			case 5:
				tiraPastel();
				break;
			case 6:
				tiraTodos();
				break;
			case 7:
				guardaPastel();
				break;
			case 8:
				salir();
				break;
			default:
				System.out.println("Da una opción válida");
				break;
		}
	}

	public void verTodos() {
		System.out.println("Vemos todos los pasteles");
		int contador_vacios=0;
		for(int i=0; i<vitrina.length; i++) {
			if(vitrina[i]==null) {
				contador_vacios++;
			} else {
				System.out.println(vitrina[i]);
			}
		}
		if(contador_vacios==vitrina.length) {
			System.out.println("No hay pasteles");
		}


	}

	public void buscaPastelSabor() {
		String sp;
		System.out.println("Buscamos pastel por sabor");
		System.out.println("Dame un sabor de pastel");
		sp=entrada2.next();
		int contador_vacios=0;
		int contador_no_encontrado=0;
		for(int i=0; i<vitrina.length; i++) {
			if(vitrina[i]==null) {
				contador_vacios++;
				contador_no_encontrado++;
			} else {
				if(vitrina[i].sabor.equals(sp)) {
					System.out.println(vitrina[i]);
				} else {
					contador_no_encontrado++;
				} 
			}
		}
		if(contador_vacios==vitrina.length) {
			System.out.println("La vitrina esta vacia");
		}

		if(contador_no_encontrado==vitrina.length) {
			System.out.println("No hay pasteles de ese sabor");
		}
	}

	public void buscaPastelPrecio() {
		System.out.println("Buscamos pastel por precio");
	}

	public void buscaPastelPisos() {
		System.out.println("Buscamos pastel por pisos");
	}

	public void tiraPastel() {
		System.out.println("Tiramos un pastel a la basura");	
	}

	public void tiraTodos() {
		System.out.println("Tiramos todos las pasteles");	
	}

	public void guardaPastel() {
		String s;
		double p;
		int np;
		System.out.println("Guardamos un pastel");	
		System.out.println("Dame el sabor del pastel");	
		s=entrada2.next();
		System.out.println("Dame el precio del pastel");	
		p=entrada3.nextDouble();
		System.out.println("Dame el número de pisos del pastel");	
		np=entrada.nextInt();
		Pastel nuevo = new Pastel(s,p,np);
		for(int i=0; i<vitrina.length; i++) {
			if(vitrina[i]==null) {
				vitrina[i]=nuevo;
				break;
			}
		}
	}

	public void salir() {
		System.out.println("Gracias por tu visita");
		System.exit(0);
	}

}