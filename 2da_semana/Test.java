public class Test{

  public static void main(String[] args) {

    Persona p1 = new Persona("ERTYUIO76543Y", "Mario", "Ruiz", "Agua", 45);
    Trabajador t1 = new Trabajador("34567890lkj", "Mauricio", "Pierard", "Mango", 60, "oiuy46789", 12000);
    TrabajadorHonorarios th2 = new TrabajadorHonorarios("FGHJK98765678", "Montse", "Perez", "Mendez", 30, 0);
    TrabajadorJubilado tj1 = new TrabajadorJubilado("FGHJK98765678", "Koki", "Nose", "Menro", 36, "RTY9876", 0, "siempre");

    System.out.println(p1.imprime() + "\n");
    System.out.println(t1.imprime() + "\n");
    System.out.println(th2 + "\n");
    System.out.println(tj1.imprime() + "\n");

    t1.saluda();


    /*System.out.println(t1.nombre);
    System.out.println(th2.nombre); */

    System.out.println("Calcula aguinaldo para los trabajadores");

    System.out.println("Aguinaldo de " + t1.nombre);
    System.out.println(t1.calculaAguinaldo(t1.sueldo_nomina));

    System.out.println("\n");

    System.out.println("Aguinaldo de " + th2.nombre);
    System.out.println(th2.calculaAguinaldo(th2.sueldo_por_comision));


  }
}
