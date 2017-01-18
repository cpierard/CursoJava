public class Agenda{

  public static void main(String[] args){

    Fecha f =  new Fecha(12, 9 , 1999);
    Contacto c = new Contacto("Gaby", f, "45678945234");

    Fecha f2 =  new Fecha(11, 7 , 1992);
    Contacto c2 = new Contacto("Gyl", f2, "4567845678");

    System.out.println("Contactos en la agenda:");
    System.out.println(c);
    System.out.println(c2);
    
  }
}
