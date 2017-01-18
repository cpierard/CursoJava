import java.util.Random;

public class Dado {
	
	public static void main(String[] args) {

		Random alea = new Random();
		int dado = 0;

		int cara_1=0;
		int cara_2=0;
		int cara_3=0;
		int cara_4=0;
		int cara_5=0;
		int cara_6=0;

		int i=1;
		while(i<=100) {
			dado=alea.nextInt(6)+1;
			if(dado==1) {
				cara_1++;
			} else if(dado==2) {
				cara_2++;
			} else if(dado==3) {
				cara_3++;
			} else if(dado==4) {
				cara_4++;
			} else if(dado==5) {
				cara_5++;
			} else {
				cara_6++;
			}
			i++;
		}

		System.out.println("Cara 1: " + cara_1);
		System.out.println("Cara 2: " + cara_2);
		System.out.println("Cara 3: " + cara_3);
		System.out.println("Cara 4: " + cara_4);
		System.out.println("Cara 5: " + cara_5);
		System.out.println("Cara 6: " + cara_6);


		if(cara_1>cara_2&&cara_1>cara_3&&cara_1>cara_4&&cara_1>cara_5&&cara_1>cara_6) {
			System.out.println("La cara de mayor frecuencia fue la 1");
		} else if(cara_2>cara_1&&cara_2>cara_3&&cara_2>cara_4&&cara_2>cara_5&&cara_2>cara_6) {
			System.out.println("La cara de mayor frecuencia fue la 2");
		} else if(cara_3>cara_1&&cara_3>cara_2&&cara_3>cara_4&&cara_3>cara_5&&cara_3>cara_6) {
			System.out.println("La cara de mayor frecuencia fue la 3");
		} else if(cara_4>cara_1&&cara_4>cara_2&&cara_4>cara_3&&cara_4>cara_5&&cara_4>cara_6) {
			System.out.println("La cara de mayor frecuencia fue la 4");
		 } else if(cara_5>cara_1&&cara_5>cara_2&&cara_5>cara_3&&cara_5>cara_4&&cara_5>cara_6) {
			System.out.println("La cara de mayor frecuencia fue la 5");
		} else if(cara_6>cara_1&&cara_6>cara_2&&cara_6>cara_3&&cara_6>cara_4&&cara_6>cara_5) {
			System.out.println("La cara de mayor frecuencia fue la 6");
		} else {
			System.out.println("Hubo empates");
		}

	}

}