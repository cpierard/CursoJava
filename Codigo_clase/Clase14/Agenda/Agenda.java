/**
 * Clase Agenda
 * esta clase permite obtener informacion de la entrada estandar
 * para poder simular el comportamiento de una agenda
 *
 * @author Cinthia Rodriguez Maya
 */


import java.io.*;
import java.util.Scanner;

public class Agenda {

	private String nombreArchivo="";
	Scanner entrada = new Scanner(System.in);
	private Contacto[] contactos;
	
	//Constructor
	public Agenda() {

	}

	//Constructor
	public Agenda(String nombreArchivo) throws RuntimeException{
		this.nombreArchivo=nombreArchivo;
		File archivoContactos= new File(nombreArchivo);
		if(archivoContactos.exists()) {
			if(!archivoContactos.canRead()) {
				throw new RuntimeException("No es posible leer el archivo "+nombreArchivo);
			}
			if(!archivoContactos.canWrite()){
				throw new RuntimeException("No es posible escribir en el archivo "+nombreArchivo);
			}
			contactos=leerContactos();
		}else{
			contactos=new Contacto[100];
		}
	}
	
	/**
	 * Metodo menu
	 * despliega las posibles acciones a realizar con la agenda
	 */
	public void menu() {
		
		Agenda miAgenda=new Agenda("Contactos");

		System.out.println("Bienvenido a tu agenda");
		System.out.println("Selecciona una opción");
		int opcion=0;
		do {
			System.out.println("1. Agregar un contacto");
			System.out.println("2. Consultar toda la agenda");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Modificar contacto");
			System.out.println("5. Borrar un contacto");
			System.out.println("6. Borrar todos los contactos");
			System.out.println("7. Salir");
			opcion=entrada.nextInt();
			switch(opcion) {
				case 1:
					miAgenda.agregarContacto();
					miAgenda.grabar();
					break;
				case 2:
					miAgenda.muestraTodo();
					break;
				case 3:
					miAgenda.buscaContacto();
					break;
				case 4:
					miAgenda.modificaContacto();
					
					break;
				case 5:
					miAgenda.borraContacto();
					break;
				case 6:
					miAgenda.borraTodo();
					break;
				case 7:
					System.out.println("Hasta Pronto");
					break;
				default:
					System.out.println("Selecciona una opción válida");
					break;
			}
		}while(opcion!=7);
		miAgenda.grabar();
	}

	/**
	 * Metodo agregarContacto
	 * agrega contactos a la agenda
	 */
	public void agregarContacto() {
		int contador=0;
		for(int i=0; i<contactos.length; i++) {
			if(contactos[i]==null) {
				System.out.println("Proporciona la siguiente información");
				System.out.println("Nombre");
				String n=entrada.next();
				System.out.println("Apellido");
				String a=entrada.next();
				System.out.println("Telefono");
				String t=entrada.next();
				System.out.println("Escribe el e-mail");
				String em=entrada.next();
				System.out.println("Fecha de cumpleaños");
				System.out.println("Día(1-31)");
				int d=entrada.nextInt();
				System.out.println("Mes(1-12)");
				int m=entrada.nextInt();
				Fecha f = new Fecha(d,m);
				Contacto c = new Contacto(n,a,t,em,f);
				contactos[i]=c;
				break;
			} else {
				contador++;
			}	
		}
		if(contador==contactos.length) {
			System.out.println("La agenda está llena");
		}
	}
	
	/**
	 * Metodo muestraTodo
	 * despliega la informacion de todos los contactos almacenados en la agenda
	 */
	public void muestraTodo() {
		int contador=0;
		for(int i=0; i<contactos.length;i++) {
			if(contactos[i]!=null) {
				System.out.println(contactos[i]);
			} else {
				contador++;
			}
		}
		if(contador==contactos.length) {
			System.out.println("La agenda está vacía");
		}

	}

	/**
	 * Metodo buscaContacto
	 * busca un contacto dado solo su nombre
    * muestra todos los que coincidan con el nombre
	 */
	public void buscaContacto() {
		System.out.println("Nombre de la persona que buscas: ");
		String nombre_buscado=entrada.next();
		int contador=0;
		for(int i=0; i<contactos.length; i++) {
			if(contactos[i]!=null) {
				String nombre_actual=contactos[i].nombre;
				if(nombre_actual.equals(nombre_buscado)) {
					System.out.println(contactos[i]);
				} else {
					contador++;
				}
			} else {
				contador++;
			}
		}
		if(contador==contactos.length) {
			System.out.println("Contacto no encontrado");
		} 
	}
	
	/**
	 * Metodo modificaContacto
	 * permite cambiar alguno de los datos de algun contacto
 	 * almacenado en la agenda
	 */
	public void modificaContacto() {
		System.out.println("Proporciona los siguientes datos de la persona que quieres modificar");
		System.out.println("Nombre: ");
		String nombre_m=entrada.next();
		System.out.println("Apellido");
		String apellido_m=entrada.next();
		int modificar=0;
		int contador=0;
		for(int i=0; i<contactos.length; i++){
			if(contactos[i]!=null) {
				if(contactos[i].nombre.equals(nombre_m) && contactos[i].apellido.equals(apellido_m))  {
					System.out.println("¿Qué deseas modificar de este contacto?");
					System.out.println("1. Nombre");
					System.out.println("2. Apellido");
					System.out.println("3. Teléfono");
					System.out.println("4. e-mail");
					System.out.println("5. Cumpleanios");
					modificar=entrada.nextInt();
					switch(modificar) {
						case 1:
							System.out.println("Escribe el nuevo nombre");
							String nombre_new = entrada.next();
							contactos[i].nombre=nombre_new;
							break;
						case 2:
							System.out.println("Escribe el nuevo apellido");
							String apellido_new = entrada.next();
							contactos[i].apellido=apellido_new;
							break;
						case 3:
							System.out.println("Escribe el nuevo teléfono");
							String tel_new = entrada.next();
							contactos[i].celular=tel_new;
							break;
						case 4:
							System.out.println("Escribe el nuevo e-mail");
							String email_new = entrada.next();
							contactos[i].email=email_new;
							break;
						case 5:
							System.out.println("Modifica el cumpleanios");
							System.out.println("Día");
							int d_new = entrada.nextInt();
							System.out.println("Mes");
							int m_new = entrada.nextInt();
							Fecha f_new = new Fecha(d_new, m_new);
							contactos[i].cumpleanios = f_new;
							break;
						default:
							System.out.println("Opción incorrecta");
							break;
					}
				}			
			} else {
				contador++;
			}	
		}
		if(contador==contactos.length) {
			System.out.println("Contacto no encontrado");
		} else {
			System.out.println("Modificacion exitosa");
		}
	}
	
	/**
	 * Metodo borraContacto
	 * elimina de la agenda a un contacto
	 * dados el nombre y apellido
	 */
	public void borraContacto() {
		int contador=0;
		System.out.println("Escribe el nombre del contacto que quieres borrar");
		String n = entrada.next();
		System.out.println("Escribe el apellido del contacto que quieres eliminar");
		String ape= entrada.next();
		for(int i=0; i<contactos.length; i++){
			if(contactos[i]!=null) {
				if(contactos[i].nombre.equals(n)&&contactos[i].apellido.equals(ape)) {
					contactos[i]=null;
				} else {
					contador++;
				}	
			} else {
				contador++;
			}
		}
		if(contador==contactos.length) {
			System.out.println("El contacto no existe");
		} else {
			System.out.println("Contacto borrado");
		}
	}

	/**
	 * Metodo borraTodo
	 * elimina todos los contactos contenidos en la agenda
	 */
	public void borraTodo() {
		for(int i=0; i<contactos.length; i++) {
			contactos[i]=null;
		}	
		System.out.println("Se han borrado todos los contactos");
	}
	
	/**	
	 * Metodo grabar
	 * envia a un archivo la informacion contenida en la agenda
	 */
	public void grabar(){
		try{
			ObjectOutputStream agenda= new ObjectOutputStream(new FileOutputStream(nombreArchivo));
			agenda.writeObject(contactos);
			agenda.close();
		}
		catch(NotSerializableException e){
			System.out.println("Error en la grabacion: "+e+"Objeto no serializable");
		}
		catch(IOException e){
			System.out.println("Error en la grabacion: "+e);
		}

	}

	/**
	 * Metodo leerContactos
	 * abre el archivo si este existe y carga la informacion
 	 * a la agenda
	 */
	public Contacto[] leerContactos(){
		try{
			ObjectInputStream lector=new ObjectInputStream(new FileInputStream(nombreArchivo));
			Contacto [] contactos=(Contacto []) lector.readObject();
			lector.close();
			this.contactos=contactos;
		}
		catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}
		catch(ClassNotFoundException e){
			System.out.println("Lectura fallida: "+e);
		}
		return contactos;
	}

}
