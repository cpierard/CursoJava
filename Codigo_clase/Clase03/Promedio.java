import java.util.Scanner;

public class Promedio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contador=1;
		int calificacion=0;
		int suma=0;
		double promedio=0.0;
		while(contador<=5) {
			System.out.println("Dame la calificacion del alumno " + contador);
			calificacion=entrada.nextInt();
			if(calificacion>=5 && calificacion<=10) {
				suma+=calificacion;
				contador++;
			} else {
				System.out.println("Verifica la calificacion");
			}
		}
		promedio=(double)suma/5;
		System.out.println("El promedio del grupo es " + promedio);
	}
}


