import java.util.Random;

public class Gato {
	
	String nombre;
	String color_ojos;
	String color_pelo;
	int meses_edad;
	String genero;
	int nivel_hambre;

	Random aleatorios = new Random();

	public Gato() {

	}

	public Gato(String n, String co, String cp, int me, String g, int nh) {
		nombre=n;
		color_ojos=co;
		color_pelo=cp;
		meses_edad=me;
		genero=g;
		nivel_hambre=nh;
	}

	public void jugar() {
		int animo=aleatorios.nextInt(5);
		if(animo<3) {
			System.out.println("El gato JUEGA contigo");
		} else {
			System.out.println("El gato te araña");
		}
	}

	public String toString() {
		String estado_animo;
		if(nivel_hambre==0||nivel_hambre==1||nivel_hambre==2||nivel_hambre==3) {
			estado_animo="ESTA FELIZ";
		} else if(nivel_hambre==4||nivel_hambre==5||nivel_hambre==6||nivel_hambre==7||nivel_hambre==8) {
			estado_animo="ESTA INDIFERENTE";
		} else {
			estado_animo="ESTA ENOJADO";
		}
		return "El gato " + nombre  + " es " + genero + " tiene ojos de color " + color_ojos + " y pelo de color " + color_pelo + " y " + meses_edad + " meses de edad " + estado_animo; 
	}

	public void comer() {
		this.nivel_hambre=0;		
	}

	public Gato cruza(Gato g1, Gato g2)  {
		int color_ojos_gatito=0;
		int color_pelo_gatito=0;
		String color_ojos_gatito_cad;
		String color_pelo_gatito_cad;
		int genero=0;
		String genero_cad;

		if((g1.genero.equals(g2.genero))) {
			System.out.println("no Se pueden cruzar");
			return null;
		} else {
			if(g1.meses_edad>=12 && g2.meses_edad>=12) {
				//Definimos el color de ojos del gatito
				color_ojos_gatito=aleatorios.nextInt(2);
				if(color_ojos_gatito==0) {
					color_ojos_gatito_cad=g1.color_ojos;
				} else {
					color_ojos_gatito_cad=g2.color_ojos;
				}
				//Definimos el color de pelo del gatito
				color_pelo_gatito=aleatorios.nextInt(2);
				if(color_pelo_gatito==0) {
					color_pelo_gatito_cad=g1.color_pelo;
				} else {
					color_pelo_gatito_cad=g2.color_pelo;
				}
				//Definimos el género del gato
				genero=aleatorios.nextInt(2);
				if(genero==0) {
					genero_cad="macho";
				} else {
					genero_cad="hembra";
				}
			} else {
				return null;
			}
		}
		Gato gatito_bb = new Gato("bb", color_ojos_gatito_cad, color_pelo_gatito_cad, 0, genero_cad, 10);
		return gatito_bb;
	}

}