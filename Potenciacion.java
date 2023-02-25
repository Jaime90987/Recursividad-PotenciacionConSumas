public class Potenciacion {

	private int base;
	private int exponente;
	private float resultado;
	
	Potenciacion(int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
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

	private float verificarBaseNegativa(int base, int exponente) {
		if(base < 0) {
			base = -base;
			if(exponente % 2 != 0)
				return -calcular(base, exponente);
			else
				return calcular(base, exponente);
		}
		
		return calcular(base, exponente);
	}

	public float getPotenciacion() {
		if(exponente < 0) {
			exponente = -exponente;
			resultado = verificarBaseNegativa(base, exponente);
			return  1/resultado; 
		}
		
		return verificarBaseNegativa(base, exponente);
	}

}