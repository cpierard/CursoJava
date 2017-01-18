public class Racional {
	
	int p;
	int q;

	public Racional(int num, int den) {
		if(den==0) {
			den=1;
		} 
		if((num<0 && den <0) || (den<0 && num>0)) {
			num*=-1;
			den*=-1;
		}
		p=num;
		q=den;
	}

	public Racional multiplicacion(Racional r1, Racional r2) {
		int num_multi=r1.p*r2.p;
		int den_multi=r1.q*r2.q;
		Racional respuesta = new Racional(num_multi, den_multi);
		return respuesta;
	}

	public Racional multiplicacion(Racional r) {
		int num_multi=r.p*this.p;
		int den_multi=r.q*this.q;
		Racional respuesta = new Racional(num_multi, den_multi);
		return respuesta;
	}

	public Racional division(Racional r) {
		int num_multi=r.q*this.p;
		int den_multi=r.p*this.q;
		Racional respuesta = new Racional(num_multi, den_multi);
		return respuesta;
	}
	public Racional suma(Racional r) {
		int num_suma=(r.p*this.q)+(r.q*this.p);
		int den_suma=r.q*this.q;
		Racional respuesta = new Racional(num_suma, den_suma);
		return respuesta;
	}


	public String toString() {
		if(p==0) {
			return "0";
		}
		int mcd=calculaMCD(p,q);
		p=p/mcd;
		q=q/mcd;
		return p + "/" + q;
	}

	/*
	 * Método que simplifica una fracción
	 */
	public Racional simplifica(Racional r) {
		int mcd=calculaMCD(r.p, r.q);
		int p_simplificado=r.p/mcd;
		int q_simplificado=r.q/mcd;
		Racional simple = new Racional(p_simplificado, q_simplificado);
		return simple;
	}

	public int calculaMCD(int a, int b){
		int aux=0;
		int r=0;
		if(a < b) {
			aux=a;
			a=b;
			b=aux;
		}
		while(b!=0) {
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}



}
