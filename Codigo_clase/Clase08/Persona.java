public class Persona {
	
	String curp;
	String nombre;
	String apellido_p;
	String apellido_m;
	int edad;

	public Persona(String c, String n, String ap, String am, int e) {
		curp=c;
		nombre=n;
		apellido_p=ap;
		apellido_m=am;
		edad=e;
	}

	public void saluda() {
		System.out.println("SOY UNA PERSONA");
	}

	public double calculaAguinaldo(int s) {
		return (double)s/2.0;
	}


	public String imprime() {
		return "Persona: " + "\n" + "CURP: " + curp + "\n" + "Nombre: " + nombre + " " + apellido_p + " " + apellido_m + "\n" + "Edad: " + edad;
	}

}
