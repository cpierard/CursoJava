public class Contacto {
	
	String nombre;
	Fecha cumple;
	String num_telefono;

	public Contacto(String n, Fecha f, String nt) {
		nombre=n;
		cumple=f;
		num_telefono=nt;
	}

	public String toString() {
		return "Contacto: " + nombre + "\n" + "Fecha cumpleanios: " + cumple + "\n" + "Num. telefono: " + num_telefono;
	}
}