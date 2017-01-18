public class Primos {
	
	public static void main(String[] args) {

		int i=2;
		int contador=0;
		int temporal=0;
		int num=0;
		while(i<=100) {
			num=i;
			contador=0;
			temporal=1;
			while(temporal<=num) {
				if(num%temporal==0) {
					contador++;
				}
				temporal++;
			}
			if(contador==2) {
				System.out.println("El " + i + " es primo");
			}
			i++;
		}
	}

}


