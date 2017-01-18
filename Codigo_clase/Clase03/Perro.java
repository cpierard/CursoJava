public class Perro {
	
	//Atributos
	String raza;
	String color_pelaje;
	String tamanio;

	public Perro(String r, String cp, String t) {
		raza=r;
		color_pelaje=cp;
		tamanio=t;
	}

	//Setters
	public void setRaza(String r) {
		raza=r;
	}

	public void setPelaje(String cp) {
		color_pelaje=cp;
	}

	public void setTamanio(String t) {
		tamanio=t;
	}

	//Getters
	public String getRaza() {
		return raza;
	}

	public String getPelaje() {
		return color_pelaje;
	}

	public String getTamanio() {
		return tamanio;
	}

	public String toString() {
		return "El perro es de raza " + raza + " color de pelaje " + color_pelaje + " y de tamaño " + tamanio;
	}




}





