public class TrabajadorJubilado extends Trabajador{

  String fecha_fin;

  public TrabajadorJubilado(String c, String n, String ap, String am, int e,
  String nss, int sn, String ff){

    super(c, n, ap, am, e, nss, sn);

    fecha_fin = ff;

  }

  public String imprime() {

    return super.imprime() + "\n" + "No trabaja desde " + fecha_fin;

  }


}
