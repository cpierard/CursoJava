public class Fecha {
	
	int dia;
	int mes;
	int anio;
	
	public Fecha(int d, int m, int a) {
		dia=d;
		mes=m;
		anio=a;
	}

	public String toString() {
		return dia+"-"+mes+"-"+anio;
	}

}