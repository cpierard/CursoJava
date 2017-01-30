public class Registro {
	
	public void registra(String nombre) throws AraceliExcepcion {
		if(nombre.equals("araceli")) {
			throw new AraceliExcepcion();
		} else {
			System.out.println("Registramos a la persona");
		} 
	} 
}