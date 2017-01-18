import java.util.Scanner;

public class Calificaciones {
	
	public static void main(String[] args) {

		/* Programa que dada una calificacion
		   de un alumno da un mensaje*/

		Scanner entrada = new Scanner(System.in);

		int calificacion=0;
		System.out.println("Escribe la calificación del alumno");
		calificacion=entrada.nextInt();

		if(calificacion>=0 && calificacion<=10) {
			if(calificacion==10) {
				System.out.println("Excelente");
			} else if(calificacion==9) {
				System.out.println("Muy bien");
			} else if(calificacion==8) {
				System.out.println("Bien");
			} else if(calificacion==7) {
				System.out.println("Regular");
			} else if(calificacion==6) {
				System.out.println("Ya que...");
			} else {
				System.out.println("MAL");
			}
		} else {
			System.out.println("calificacion inválida");
		}
	}
}

