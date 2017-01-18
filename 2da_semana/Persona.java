public class Persona {

  String CURP;
  String nombre;
  String apellido_p;
  String apellido_m;
  int edad;

  public Persona(String c, String n, String ap, String am, int e) {

    CURP = c;
    nombre = n;
    apellido_p = ap;
    apellido_m = am;
    edad = e;

  }

  public String imprime() {

    return "Persona: " + "\n" + "CURP: " + CURP + "\n" + "Nombre: " + nombre + " " +
    apellido_p + " " +  apellido_m;

  }

  public void saluda() {

    System.out.println("Hola, soy una persona ");
  }

  public double calculaAguinaldo(int s){

    return (double)s/2.0;

  }

}
