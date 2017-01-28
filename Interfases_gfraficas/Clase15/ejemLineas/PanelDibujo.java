import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;



public class PanelDibujo extends JPanel {

	//Dibuja una x desde las esquinas del panel
	public void paintComponent(Graphics g) {
		//Llama a paintComponent para asegurar que el panel se muestre correctamente
		super.paintComponent( g );

		int anchura = getWidth();
		int altura = getHeight();

		//Dibuja una línea de la esquina superior izquierda a la esquina inferior derecha
		//g.drawLine( 0, 0, anchura, altura);
		//Dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
		//g.drawLine( 0, altura, anchura, 0);

		//Dibuja una línea de la esquina superior izquierda a la esquina inferior derecha
		//g.drawLine( 0, altura/2, anchura, altura/2);
		//Dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
		//g.drawLine( anchura/2, 0, anchura/2, altura);

		/*Color c = new Color(0,255,0);
		g.setColor(c);
		g.fillRect(100,100,300,350);

		Color c2 = new Color(50,133,200);
		g.setColor(c2);
		g.fillOval(300,100,100,100);*/

		//azul
		Color color1 = new Color(155,110,40);
		//negro
		Color color2 = new Color(0,0,0);
		int contador=1;
		int x=30;
		int y=30;
		int desp_x=50;
		int desp_y=50;
		while(contador<=12) {
			if(contador%2==0) {
				g.setColor(color1);
			} else {
				g.setColor(color2);
			}
			g.fillRect(x,y,desp_x,desp_y);
			x+=20;
			y+=20;
			desp_x+=20;
			desp_y+=20;
			contador++;
		}

	}

} 
	

