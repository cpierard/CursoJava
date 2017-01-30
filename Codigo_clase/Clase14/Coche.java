public class Coche {
	
	String marca;
	String color;
	int modelo;

	public Coche(String ma, String c, int m) {
		marca=ma;
		color=c;
		modelo=m;
	}

	public static void arrancar() {
		System.out.println("El coche arranca");
	}


	public static void frenar() {
		System.out.println("El coche frena");	
	}


	public static double calcula_velocidad(int distancia, int tiempo) {
		double vel= (double)distancia/(double)tiempo;
		return vel;
	}

	public String toString() {
		return "Coche: " + marca + " Color " + color + " Modelo: " + modelo;
	}

	public static void main(String[] args) {

		arrancar();
		frenar();
		double v = calcula_velocidad(1000,20);
		System.out.println(v);


	}

}