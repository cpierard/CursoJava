public class Fecha{

  int dia;
  int mes;
  int ano;

  public Fecha(int d, int m, int a){

    dia = d;
    mes = m;
    ano = a;

  }

  public String toString(){

    return dia + "-" + mes + "-" + ano;

  }
}
