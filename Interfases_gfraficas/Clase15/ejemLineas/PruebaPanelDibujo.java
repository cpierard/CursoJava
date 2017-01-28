
import javax.swing.JFrame;

public class PruebaPanelDibujo {

	public static void main(String[] args) {

		//Crea un panel que contiene nuestro dibujo
		PanelDibujo panel = new PanelDibujo();

		//Crea un nuevo marco 
		JFrame aplicacion = new JFrame();

		//Establece el marco para salir cuando se cierre
		aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		aplicacion.add(panel);		//agrega el panel al marco
		aplicacion.setSize(600,600);	//establece tamaño del marco
		//aplicacion.setResizable(false);
		aplicacion.setVisible(true);

	}

}
