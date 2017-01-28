public class Coche {

  String marca;
  String color;
  int modelo;

  public Coche(String m, String c, int mo) {

    marca = m;
    color = c;
    modelo = mo;

  }

  public static void main(String[] args) {

    Coche c = new Coche("Peugeot", "Azul", 2005);
    System.out.println(c);
    arracar();
    frenar();
    double v = calculaVelocidad(400, 100);
    System.out.println(v);

  }

  public static void arracar(){

    System.out.println("El coche arranca");

  }

  public static void frenar() {

      System.out.println("El coche frena");

  }

  public static double calculaVelocidad(int distancia, int tiempo){

    return (double)distancia / (double)tiempo;

  }

  public String toString(){

    return "Coche: " + marca + ", " + color + ", " + modelo;
  }
}
