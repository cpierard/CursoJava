public class Pastel {
	
	String sabor;
	double precio;
	int numero_pisos;

	public Pastel(String s, double p, int np) {
		sabor=s;
		precio=p;
		numero_pisos=np;
	}

	public String toString() {
		return "Pastel de sabor : " + sabor + "\n" + "Precio : $" + precio + "\n" + "Número de pisos: " + numero_pisos + "\n";
	}
}
