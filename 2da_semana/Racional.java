public class Racional {

  int p;
  int q;

  public Racional(int num, int den){

    if(den == 0){

      den = 1;

    }
    if(num < 0 && den < 0 || num > 0 && den < 0) {

      num *= -1;
      den *= -1;

    }


    p = num;
    q = den;

  }

  public Racional multiplicacion(Racional r1, Racional r2){

    int num_multi = r1.p * r2.p;
    int den_multi = r1.q * r2.q;

    Racional respuesta = new Racional(num_multi, den_multi);

    return respuesta;

  }

  public Racional division(Racional r2){

    int num_div = this.p * r2.q;
    int den_div = this.q * r2.p;

    Racional respuesta = new Racional(num_div, den_div);

    return respuesta;

  }

  public Racional multiplicacion(Racional r2){

    int num_multi = this.p * r2.p;
    int den_multi = this.q * r2.q;

    Racional respuesta = new Racional(num_multi, den_multi);

    return respuesta;

  }

  public Racional suma(Racional r2){

    int num_suma = this.p * r2.q + r2.p * this.q;
    int den_suma = this.q * r2.q;

    Racional respuesta = new Racional(num_suma, den_suma);

    return respuesta;

  }

  //Método que simplifica una fracción.

  public Racional simplifica(Racional r) {

    int mcd = calculaMCD(r.p, r.q);
    int 

  }

  public calculaMCD(int a, int b){

    int aux = 0;
    int r;

    if(a < b){

      aux = a;
      a = b;
      b = aux;

    }
    while(b != 0){
      r = a%b;

    }
  }
  public String toString(){

    if(p == 0){

      return "0";

    }

      return p + "/" + q;

  }
}
