import java.util.Scanner;

public class Vitrina {

  Pastel[] vitrina = new Pastel[5];
  Scanner entrada = new Scanner(System.in);

  public void menu() {

    int opcion = 0;
    do {
      System.out.println("Selecciona una opción");
      System.out.println("1. Ver todos los pasteles");
      System.out.println("2. Buscar pastel por sabor");
      System.out.println("3. Buscar pastel por precio");
      System.out.println("4. Buscar pastel por número de pisos");
      System.out.println("5. Tirar pastel");
      System.out.println("6. Tirar todos los pasteles");
      System.out.println("7. Guardar pastel");
      System.out.println("8. Salir");

      opcion == entrada.nextInt();

      leeOpcion(opcion)

    } while(opcion != 8);

  }

  public void leeOpcion(int op) {

    switch(op) {
      case 1:
        verTodos();
        break;
      case 2:
        buscaPastelSabor();
        break;
      case 3:
        buscaPastelPrecio();
        break;
      case 4:
        buscaPastelPisos();
        break;
      case 5;
        tiraPastel();
        break;
      case 6:
        tiraTodo();
        break;
      case 7:
        guardaPatel();
        break;
      case 8:
        salir();
        break;
      default:
        System.out.println("Dame una opción válida!!");
        break;
    }

  }

  public void verTodos() {

    System.out.println("Tenemos de todo");

  }

  public void buscaPastelSabor() {

    System.out.println("Tenemos de todos los sabores");

  }

  public void buscaPastelPisos() {

    System.out.println("Tenemos de muchos pisos");

  }

  public void buscaPastelPrecio() {

    System.out.println("De todos los precios");

  }

  public void tiraPastel() {

    System.out.println("Ok, lo tiramos, pero no vuelvas");

  }

  public void tiraTodo() {

    System.out.println("Tiramos todo, no te queremos");

  }

  public void guardaPatel() {

    System.out.println("Va, lo guardamos");

  }

  public void salir() {

    System.out.println("Chao!");
    System.exit(0);

  }

}
