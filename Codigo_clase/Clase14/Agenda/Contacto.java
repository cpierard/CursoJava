/**
 * Clase Contacto 
 * Esta clase modela un objeto de tipo contacto para almacenarse
 * en nuestra agenda
 * 
 * @author Cinthia Rodriguez Maya
 */

import java.io.Serializable;

public class Contacto implements Serializable {

	protected String nombre;
	protected String apellido;
	protected String celular;
	protected String email;
	protected Fecha cumpleanios;
	
	//Constructor
	public Contacto(String n, String ape, String c, String em, Fecha cumple) {
		nombre=n;
		apellido=ape;
		celular=c;
		email=em;
		cumpleanios=cumple;
	}

	//Metodo toString
	public String toString() {
		return "Nombre " + nombre  + " Apellido " + apellido + "\n" + "Celular " + celular + "\n" + "e-mail " + email + "\n" + "Cumple " + cumpleanios;
	}

}
