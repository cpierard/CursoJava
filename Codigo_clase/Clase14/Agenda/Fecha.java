/**
 * Clase Fecha
 * modela un objeto de clase Fecha
 *
 * @author Cinthia Rodriguez Maya
 */


import java.io.Serializable;

public class Fecha implements Serializable {

	private int dia;
	private int mes;
	private String nombre_mes="";

	//Constructor
	public Fecha(int d, int m) {
		dia=d;
		mes=m;
		daNombreMes(mes);	
	}

	/**
	 * Metodo daNombre
	 * Dependiendo del numero de mes regresa el nombre de este
	 * @param m, el numero de mes
	 */
	public void daNombreMes(int m) {
		switch(m) {
			case 1:
				nombre_mes="Enero";
				break;
			case 2:	
				nombre_mes="Febrero";
				break;
			case 3:
				nombre_mes="Marzo";
				break;
			case 4:
				nombre_mes="Abril";
				break;
			case 5:
				nombre_mes="Mayo";
				break;
			case 6:
				nombre_mes="Junio";
				break;
			case 7:
				nombre_mes="Julio";
				break;
			case 8:
				nombre_mes="Agosto";
				break;
			case 9:
				nombre_mes="Septiembre";
				break;
			case 10:
				nombre_mes="Octubre";
				break;
			case 11:
				nombre_mes="Noviembre";
				break;
			case 12:
				nombre_mes="Diciembre";
				break;
		}
	}

	//Metodo toString
	public String toString() {
		return dia + " de " + nombre_mes;
	}

}
