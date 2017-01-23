public class Test {
	
	public static void main(String[] args) {

		Persona p1 = new Persona("IERIEKSK", "Mario", "Ruiz", "Flores", 33);
		Trabajador t1 = new Trabajador("IERIEKSK", "Mario", "Ruiz", "Flores", 33, "YYUU88", 12000);
		TrabajadorHonorarios th1  = new TrabajadorHonorarios("IERIEKSK", "Alberto", "Hdz", "Gutierrez", 33, 2000);
		TrabajadorJubilado tj1 = new TrabajadorJubilado("IERIEKSK", "Angelica", "Mendez", "Flores", 56, "YYUU88", 7000, "01-01-2017");

		System.out.println(p1.imprime());
		System.out.println(t1.imprime());
		System.out.println(th1.imprime());
		System.out.println(tj1.imprime());
		t1.saluda();

		System.out.println(t1.nombre);
		System.out.println("Calculamos dinero extra a pagar por el aguinaldo");
		System.out.println("Aguinaldo de " + t1.nombre);
		System.out.println(t1.calculaAguinaldo(t1.sueldo_nomina));
		System.out.println("Aguinaldo de " + th1.nombre);
		System.out.println(th1.calculaAguinaldo(th1.sueldo_por_comision));

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		TrabajadorJubilado tj2 = new TrabajadorJubilado(t1, "18-01-2017");
		System.out.println(tj2.imprime());



	}


}