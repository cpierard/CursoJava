import java.util.Random;

public class Ahorcado {
	
	String[] posibilidades = {"COCODRILO", "PERRO", "OSO", "RATON", "CABALLO"};
	Random alea = new Random();

	public void jugar() {
		int palabra=alea.nextInt(posibilidades.length);
		int cantidad=posibilidades[palabra].length();
		String[] pregunta= new String[cantidad];
		for(int i=0; i<cantidad; i++) {
			char c = posibilidades[palabra].charAt(i);
			String cad = Character.toString(c);
			pregunta[i]=cad;
		}
		for(String s : pregunta) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}

