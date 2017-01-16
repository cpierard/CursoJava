public class UsoGatos {

  public static void main(String[] args){

    Gato g1 = new Gato("Caramel", "amarillos", "naranja", 24, "gata");
    Gato g2 = new Gato("Koki", "verdes", "pardo", 34, "gata");
    Gato g3 = new Gato("Pandus", "amarillos", "gris", 84, "gata");

    System.out.println(g1);
    System.out.println(g2);
    System.out.println(g3);

    g1.jugar();

  }

}
