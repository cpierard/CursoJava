public class Librero {
	
	String[] librero = new String[3];

	public void daNombreLibro(String nombre) throws LibreroLlenoExcepcion {
		int contador=0;
		for(int i=0; i<librero.length; i++) {
			if(librero[i]==null) {
				librero[i]=nombre;
				break;
			} else {
				contador++;
			}
		}
		if(contador==librero.length) {
			throw new LibreroLlenoExcepcion();
		}
	}


	public void daContenidoLibrero() {
		for(int i=0; i<librero.length; i++) {
			if(librero[i]!=null) {
				System.out.println("Libro " + librero[i]);	
			}
			
		}
	}
}