/* Ejercicio de GUI
 * Clase que mediante el uso de cuadros de diálogo, suma dos enteros
 * @author: Cinthia Rodríguez Maya
 */
import javax.swing.JOptionPane;
import javax.swing.UIManager; 
import javax.swing.plaf.ColorUIResource; 

public class CuadrosDialogo {

	public static void main(String[] args) {

		String[] agenda = new String[10];
		String opcion;
		
		do {
			opcion=JOptionPane.showInputDialog("Selecciona una opción: \n 1. Guardar Contacto \n 2. Ver contactos \n 3. Salir");
			if(opcion.equals("1")) {
				String nombreContacto=JOptionPane.showInputDialog("Escribe el nombre del contacto ");
				String apellidoContacto=JOptionPane.showInputDialog("Escribe el apellido del contacto ");
				String telefono=JOptionPane.showInputDialog("Escribe el teléfono del contacto ");
				String mi_contacto ="Nombre: "+ nombreContacto + "\n" + "Apellido: " + apellidoContacto + "\n" + "Teléfono: " + telefono;
				for(int i=0; i<agenda.length; i++) {
					if(agenda[i]==null) {
						agenda[i]=mi_contacto;
						String info = "Has agregado a:" + mi_contacto;
						JOptionPane.showMessageDialog(null, info, null, JOptionPane.PLAIN_MESSAGE); 
						break;
					}
				}
			} else if(opcion.equals("2")) {
				String informacion="";
				for(int i=0; i<agenda.length; i++) {
					if(agenda[i]!=null) {
						informacion+=agenda[i];
					}
				}
				JOptionPane.showMessageDialog(null, informacion, null, JOptionPane.PLAIN_MESSAGE); 
			}
		} while(opcion.equals("3")==false);

		/*UIManager uim=new UIManager();  
		uim.put("OptionPane.background",new ColorUIResource(0,0,255));*/  

	}

}

