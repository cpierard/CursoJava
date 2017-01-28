public class Librero{

  String[] librero = new String[3];

  public void daNombres(String nombre) throws LibreroLlenoExcepcion {
    int contador = 0;
    for(int i = 0; i < libreri.length; i++){

      if(librero[i] == null) {
        librero[i] = nombre;

      } else {
        contador++;
      }

    }
    if(contador == librero.length) {

      throw new LibreroLlenoExcepcion;

    }
  }

  public void daContenidoLibrero() {

    
  }
}
