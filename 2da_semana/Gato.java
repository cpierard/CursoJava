import java.util.Random;

public class Gato {

  String nombre;
  String color_ojos;
  String color_pelo;
  int meses_edad;
  String genero;

  Random aleatorios = new Random();

  public Gato(String n, String co, String cp, int me, String ge){

    nombre = n;
    color_pelo = cp;
    color_ojos = co;
    meses_edad = me;
    genero = ge;

  }

  public String toString(){

    return "El gato " + nombre + " tiene ojos de color " + color_ojos + ", pelo de color "
    + color_pelo + ", tiene la edad de " + meses_edad + " meses y es " + genero;

  }

  public void jugar(){

    int animo = aleatorios.nextInt(5);

    if(animo <= 3){

      System.out.println("El gato juega contigo");


    } else {

      System.out.println("El gato te araña");

    }
  }
}
