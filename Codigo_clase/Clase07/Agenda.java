public class Agenda {
	
	public static void main(String[] args) {

		Fecha f = new Fecha(12,9,1990);
		Contacto c = new Contacto("Gabriela",f,"5782311");
		Fecha f2 = new Fecha(20,11,1950);
		Contacto c2 = new Contacto("Mario",f2,"78990988");
		System.out.println("Contactos en la agenda");
		System.out.println(c);
		System.out.println(c2);



	}








}
