public class Perro {

  //Atributos
  String raza;
  String color_pelaje;
  String tamanio;

  public Perro(String r, String cp, String t) {

    raza = r;
    color_pelaje = cp;
    tamanio = t;

  }

  public String toString() {

    return "El perro es de raza " + raza + " color de pelaje "
    + color_pelaje + " y tamaño " + tamanio;

  }
}
