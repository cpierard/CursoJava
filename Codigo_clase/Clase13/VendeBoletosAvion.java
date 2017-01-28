interface VendeBoletosAvion {

	/*
	 * Solicita al usuario un destino de viaje
	 */
	public void pideNombreDestino();

	/*
	 * Pide al usuario su nombre y número de pasaporte
	 *
	 */
	public void pideDatosPasajeroInternacional();

	/*
	 * Pide al usuario su nombre
	 *
	 */
	public void pideDatosPasajeroNacional();

	/*
	 * Pregunta si el viaje es nacional o internacional
	 */
	public boolean esNacional();


	/*
	 * Imprime un boleto con al información del pasajero
	 */
	public void imprimeBoleto();

} 