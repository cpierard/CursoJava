public class UsoAerolinea {
	
	public static void main(String[] args) {

		Aerolinea ae = new Aerolinea();

		boolean nacional;

		nacional=ae.esNacional();
		if(nacional) {
			ae.pideDatosPasajeroNacional();
		} else {
			ae.pideDatosPasajeroInternacional();
		}

		ae.pideNombreDestino();
		ae.imprimeBoleto();
	}


}