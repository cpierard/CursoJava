public class UsoRacional {

  public static void main(String[] args) {

    Racional r1 = new Racional(-3, -4);
    Racional r2 = new Racional(8, -5);
    Racional r3 = new Racional(0, -4);
    Racional r4 = new Racional(8, 0);

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);

    System.out.println(r1.multiplicacion(r1, r2));

    System.out.println(r1.multiplicacion(r2));

    System.out.println(r4.multiplicacion(r3));

    System.out.println("La división de " + r1 + " entre " + r2 + " es " + r1.division(r2) );

    System.out.println("La sume de " + r1 + " y " + r2 + " es " + r1.suma(r2));

  }
}


//Tarea moral: hacer un método que saque el max comun divisor entre dos números
// y simplifique la fracc. Buscar los algoritmos.
