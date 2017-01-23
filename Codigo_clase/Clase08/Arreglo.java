public class Arreglo {

	public static void main(String[] args) {

		//Declaración de un arreglo
		boolean[] arr = new boolean[10];
		arr[3]=true;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int[] arr2 = {1,2,3,4,5,6};
		arr2[0]+=3;
		arr2[5]+=3;
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}



		System.out.println();




	}


}
