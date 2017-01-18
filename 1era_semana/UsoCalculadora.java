public class UsoCalculadora {

  public static void main(String[] args) {

    Calculadora m2 = new Calculadora();

    int var_suma = m2.suma(2, 3);
    int var_resta = m2.resta(2, 19);
    int var_mult = m2.multiplicacion(5, 5);
    float var_div = m2.division(10, 3);

    System.out.println(var_suma);
    System.out.println(var_resta);
    System.out.println(var_mult);
    System.out.println(var_div);

  }
}
