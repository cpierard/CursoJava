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
		if(vitrinaVacia()) {
			System.out.println("No hay pasteles");
		} else {
			for(int i=0; i<vitrina.length; i++) {
				if(vitrina[i]!=null) {
					System.out.println("#"+(i+1) + " - " + vitrina[i]);
				}
			}	
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
		boolean encontrado=false;
		double cantidad=0.0;
		System.out.println("Buscamos pastel por precio");
		if(vitrinaVacia()) {
			System.out.println("No hay pasteles almacenados");
		} else {
			System.out.println("Escribe el precio del pastel");
			cantidad=entrada3.nextDouble();
			for(int i=0; i<vitrina.length; i++) {
				if(vitrina[i]!=null) {
					if(vitrina[i].precio==cantidad) {
						System.out.println(vitrina[i]);
						encontrado=true;
					}
				}

			}
		}
		if(encontrado==false) {
			System.out.println("No hay pasteles de precio igual a " + cantidad);
		}

	}

	public void buscaPastelPisos() {
		System.out.println("Buscamos pastel por pisos");
	}

	public void tiraPastel() {
		System.out.println("Tiramos un pastel a la basura");
		verTodos();
		System.out.println("Escribe el # identificador del pastel a quitar");		
		int opcionBorra=entrada.nextInt();
		vitrina[opcionBorra-1]=null;
	}

	public void tiraTodos() {
		System.out.println("Tiramos todos las pasteles");
		int confirma=0;
		System.out.println("¿Estás seguro?");
		System.out.println("1. Sí ");
		System.out.println("2. No ");
 		confirma=entrada.nextInt();
 		if(confirma==1) {
 			for(int i=0; i<vitrina.length; i++) {
				vitrina[i]=null;
			}	
 		} 
	}

	public void guardaPastel() {
		String s;
		double p;
		int np;
		if(hayEspacio()) {
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
		} else {
			System.out.println("Ya no hay espacio");
		}
	}

	public void salir() {
		System.out.println("Gracias por tu visita");
		System.exit(0);
	}

	public boolean vitrinaVacia() {
		boolean vacia=true;
		for(int i=0; i<vitrina.length; i++) {
			if(vitrina[i]!=null) {
				vacia=false;
				break;
			} 
		}
		return vacia;
	}

	public boolean hayEspacio() {
		boolean espacio=false;
		for(int i=0; i<vitrina.length; i++) {
			if(vitrina[i]==null) {
				espacio=true;
				break;
			} 
		}
		return espacio;
	}
}