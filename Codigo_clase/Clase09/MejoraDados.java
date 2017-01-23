import java.util.Random;

public class MejoraDados {
	
	public static void main(String[] args) {

		Random aleatorios = new Random();
		int[] caras = new int[6];
		int cara=0;
		int contador=1;
		while(contador<=1000) {
			cara=aleatorios.nextInt(6);
			switch(cara) {
				case 0:
					caras[0]++;
					break;
				case 1:
					caras[1]++;
					break;
				case 2:
					caras[2]++;
					break;
				case 3:
					caras[3]++;
					break;
				case 4:
					caras[4]++;
					break;
				case 5:
					caras[5]++;
					break;
			}
			contador++;
		}


		//Imprimimos las frecuencias de las caras
		System.out.println("Frecuencias caras");
		/*for(int i=0; i<caras.length; i++) {
			System.out.println((i+1)+": " + caras[i]);
		}*/

		int i=1;
		for(int v : caras) {
			System.out.println(i+": " + v);
			i++;
		}
	}

}