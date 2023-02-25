public class Potenciacion {

	private int base;
	private int exponente;
	private float resultado;
	
	Potenciacion(int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
	}

	public float getPotenciacion() {

		if(exponente < 0) {
			exponente = -exponente;

			if(base < 0) {
				base = -base;
				if(exponente % 2 != 0)
					resultado = -calcular(base, exponente);
				else 
					resultado = calcular(base, exponente);
			}else
				resultado = calcular(base, exponente);

			resultado = 1/resultado; 

		}else {

			if(base < 0) {
				base = -base;
				if(exponente % 2 != 0)
					resultado = -calcular(base, exponente);
				else
					resultado = calcular(base, exponente);
			}else 
				resultado = calcular(base, exponente);
		}

		return resultado;
	}

	private int multiplicar(int base, int exponente) {
		if(exponente == 1) {
			return base;
		}
			
		return base + multiplicar(base, exponente - 1);
	}

	private int calcular(int base, int exponente) {
		
		if(exponente == 0) {
			return 1;
		}

		if(exponente == 1) {
			return base;
		}
			
		return  multiplicar(base,calcular(base,exponente - 1));
	}

}