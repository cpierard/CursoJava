public class UsoMetodos {
	
	public static void main(String[] args) {

		//creamos objeto de clase Metodos
		Metodos m1 = new Metodos();
		m1.saluda();
		String var = m1.saluda2();
		System.out.println(var);
		m1.saludaNombre("Angel");

		String var2 = m1.saludaNombre2("Hugo");
		System.out.println(var2);



	}




} 