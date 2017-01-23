public class UsoPasteles {

  public static void main(String[] args) {

    Pastel p1 = new Pastel("Fresas", 500.0, 1);
    Pastel p2 = new Pastel("Selva Negra", 600.0, 3);
    Pastel p3 = new Pastel("Maracuyá", 400.0, 1);
    Pastel p4 = new Pastel("Frutas", 300.0, 2);
    Pastel p5 = new Pastel("Imposible", 150.0, 1);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);

    Vitrina v = new Vitrina;

    v.menu();

  }
}
