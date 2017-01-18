public class Contacto{

  String nombre;
  Fecha cumple;
  String num_telefono;

  public Contacto (String n , Fecha f, String nt){

    nombre = n;
    cumple = f;
    num_telefono = nt;

  }

  public String toString(){

    return "Contacto: " + nombre + "\n" + "Cumpeaños: " + cumple + "\n" +
    "Número de teléfono: " + num_telefono;


  }
}
