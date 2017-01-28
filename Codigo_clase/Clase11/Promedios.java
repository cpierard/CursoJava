public class Promedios {
	
	public static void main(String[] args) {

		int[][] tabla = {{7,8,9,5},{10,10,9,9},{5,5,5,6},{7,8,10,10}};

		double mayor;
		double promedio=0.0;
		mayor=promedio;
		int ganador=0;

		for(int i=0; i<tabla.length; i++) {
			promedio=0.0;
			for(int j=0; j<tabla[i].length; j++) {
				promedio+=(double)tabla[i][j];
			}
			promedio=(double)promedio/tabla[i].length;
			System.out.println(promedio);
			if(promedio>mayor) {
				mayor=promedio;
				ganador=i;
			}
		}

		System.out.println("El mejor alumno fue " + ganador + " con promedio de " + mayor);
	}

}
