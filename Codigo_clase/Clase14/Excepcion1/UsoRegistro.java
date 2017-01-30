public class UsoRegistro {
	
	public static void main(String[] args) {

		Registro r = new Registro();
		try {
			r.registra("araceli");
		} catch(AraceliExcepcion ae) {
			System.out.println("No se admiten Aracelis " + ae);
		}
	}
}