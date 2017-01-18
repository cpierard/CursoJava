public class UsoPunto {
	
	public static void main(String[] args) {

		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(-4,6);
		Punto interviene = new Punto();
		System.out.println(p1);
		System.out.println(p2);
		double resDistancia=interviene.distancia(p1,p2);
		System.out.println("La distancia de " + p1 + " a " + p2 + " es " +resDistancia);
		System.out.println("La distancia de " + p1 + " a " + p2 + " es " + p1.distancia(p2));




	}

}