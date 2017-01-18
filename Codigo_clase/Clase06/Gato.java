import java.util.Random;

public class Gato {
	
	String nombre;
	String color_ojos;
	String color_pelo;
	int meses_edad;
	String genero;
	int nivel_hambre;

	Random aleatorios = new Random();

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

	public void cruza(Gato g1, Gato g2)  {
		if((g1.genero.equals(g2.genero))) {
			System.out.println("no Se pueden cruzar");
		} else {
			System.out.println("Se pueden cruzar");
		}
		//return null;
	}






}