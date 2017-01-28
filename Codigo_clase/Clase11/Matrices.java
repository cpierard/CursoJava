public class Matrices {
	
	public static void main(String[] args) {

		//int[][] matriz = new int[3][4];

		int[][] matriz = {{1,2,3,0},{4,5},{7,8,9,7,7,8,9}};


		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		for(int[] arr : matriz) {
			for(int valor : arr) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
	}
}