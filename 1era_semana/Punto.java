public class Punto {

  int x;
  int y;

  public Punto(int x, int y){

    this.x = x;
    this.y = y;

  }
//Método vacío para el constructor

public Punto(){

}


public String toString(){

  return "(" + x + "," + y + ")";

}

//Método calcula distancia dos puntos

public double distancia(Punto p_1, Punto p_2){

  double d = Math.sqrt( Math.pow( p_2.x - p_1.x, 2) + Math.pow( p_2.y - p_1.y, 2));

  return d;
}

//Método que calcula la distancia de un punto a otro
//Un punto pi calcula su distancia a otro pj

public double distancia(Punto pj) {

  double d = Math.sqrt( Math.pow( pj.x - this.x, 2) + Math.pow( pj.y - this.y, 2));

  return d;

}

}
