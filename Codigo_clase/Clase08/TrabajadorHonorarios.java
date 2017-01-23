public class TrabajadorHonorarios extends Persona {
	
	int sueldo_por_comision;

	public TrabajadorHonorarios(String c, String n, String ap, String am, int e, int spc) {
		super(c,n,ap,am,e);
		sueldo_por_comision=spc;
	}

	public String imprime() {
		return  super.imprime() + "Sueldo por comision: " + sueldo_por_comision;
	}


}