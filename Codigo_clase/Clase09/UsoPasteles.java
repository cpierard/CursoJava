public class UsoPasteles {
	
	public static void main(String[] args) {

		Pastel p1 = new Pastel("chocolate",25.50,1);
		Pastel p2 = new Pastel("fresa",300.00,2);
		Pastel p3 = new Pastel("chocolate",500.00,3);
		Pastel p4 = new Pastel("fresa",100.50,1);
		Pastel p5 = new Pastel("durazno",50.95,1);

		/*System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);*/

		Vitrina v = new Vitrina();
		v.menu();


	}

}