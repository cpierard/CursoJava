public class UsoLibrero {
	
	public static void main(String[] args) {

		Librero l = new Librero();
		try {
			l.daNombreLibro("Calculus");
			l.daNombreLibro("The art of Java");
			l.daNombreLibro("Java for dummies");
			l.daNombreLibro("Como hacer origami");
			l.daContenidoLibrero();
		} catch(LibreroLlenoExcepcion lle) {
			System.out.println("No es posible guardar más libros " + lle);
		}

	}

}