public class UsoRacional {
	
	public static void main(String[] args) {

		Racional r1= new Racional(3,4);
		Racional r2= new Racional(6,5);
		Racional r3= new Racional(7,0);
		Racional r4 = new Racional(2,-7);
		Racional r5 = new Racional(0,-7);

		System.out.println(r1);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

		System.out.println("El producto de " + r1 + " con " + r2  + " es " + r1.multiplicacion(r1,r2));
		System.out.println("El producto de " + r1 + " con " + r2  + " es " + r1.multiplicacion(r2));
		System.out.println("El producto de " + r4 + " con " + r5  + " es " + r4.multiplicacion(r5));
		System.out.println("La division de " + r1 + " con " + r2  + " es " + r1.division(r2));

		System.out.println("La suma de " + r1 + " con " + r2  + " es " + r1.suma(r2));
	}

}