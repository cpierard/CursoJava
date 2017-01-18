import java.util.Random;

public class UsoGatos {
	
	public static void main(String[] args) {

		Random aleatorios = new Random();
		int nh=0;
		nh=aleatorios.nextInt(11);
		Gato g1 = new Gato("burbuja", "gris","blanco",24, "hembra", nh);
		nh=aleatorios.nextInt(11);
		Gato g2 = new Gato("benito", "negro","azul",50, "macho", nh);
		nh=aleatorios.nextInt(11);
		Gato g3 = new Gato("lunita", "café","verde",3, "hembra", nh);
		/*
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		g3.jugar();*/
		System.out.println(g1);
		//Le damos de comer al gato
		g1.comer();
		System.out.println(g1);
		System.out.println("TRAZAMOS DE CRUZAR A LOS GATOS");
		g1.cruza(g1,g2);









	}


}