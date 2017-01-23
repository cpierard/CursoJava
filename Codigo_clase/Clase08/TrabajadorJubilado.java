public class TrabajadorJubilado extends Trabajador {
	
	String fecha_fin;

	public TrabajadorJubilado(Trabajador t, String ff) {
		super(t.curp, t.nombre, t.apellido_p, t.apellido_m, t.edad, t.numero_ss, t.sueldo_nomina);
		fecha_fin=ff;
	}

	public TrabajadorJubilado(String c, String n, String ap, String am, int e, String nss, int sn, String ff) {
		super(c,n,ap,am,e,nss,sn);
		fecha_fin=ff;
	}

	public String imprime() {
		return super.imprime() + "ya no labora desde " + fecha_fin;
	}


}