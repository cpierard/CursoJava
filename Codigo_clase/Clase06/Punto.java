
public class Punto {
	
	int x;
	int y;

	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public Punto() {

	}

	public String toString() {
		return "( " + x + "," + y +" )";
	}

	//Método que calcula la distancia entre dos puntos
	public double distancia(Punto p_1, Punto p_2) {
		double d = Math.sqrt(Math.pow(p_2.x-p_1.x,2) + Math.pow(p_2.y-p_1.y,2));
		return d;
	}

	//Método que calcula la distancia de un punto a otro
	//Un punto pi calcula su distancia a otro pj
	public double distancia(Punto pj) {
		/*int pj_x=pj.x;
		int pj_y=pj.y;
		int pi_x=this.x;
		int pi_y=this.y;
		System.out.println("Coordenadas de pj");
		System.out.println(pj_x);
		System.out.println(pj_y);
		System.out.println("Coordenadas de pi");
		System.out.println(pi_x);
		System.out.println(pi_y);*/
		double d = Math.sqrt(Math.pow(pj.x-this.x,2) + Math.pow(pj.y-this.y,2));
		return d;


	}



}










