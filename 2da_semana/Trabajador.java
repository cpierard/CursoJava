public class Trabajador extends Persona{

  String numero_ss;
  int sueldo_nomina;

  public Trabajador(String c, String n, String ap, String am, int e,
  String nss, int sn){

    super(c, n, ap, am, e);

    numero_ss = nss;
    sueldo_nomina = sn;

  }

  public String imprime() {

    return super.imprime() + "\n" + "NSS: " + numero_ss + "\n" + "Sueldo nómina: "
    + sueldo_nomina;

  }
}
