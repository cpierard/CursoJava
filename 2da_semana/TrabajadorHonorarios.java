public class TrabajadorHonorarios extends Persona{

    int sueldo_por_comision;

    public TrabajadorHonorarios(String c, String n, String ap, String am, int e,
    int spc) {

      super(c, n, ap, am, e);

      sueldo_por_comision = spc;

    }

    public String toString() {

      return "Trabajador Honorarios: " + "\n" + "CURP: " + CURP + "\n" + "Nombre: " + nombre + " " +
      apellido_p + " " +  apellido_m + "\n" + "Sueldo por comisión: " +
      sueldo_por_comision;

    }
}
