package loop;

public class GeradorDePrimos2 {
	public boolean ePrimo(int x) {
		if (x < 2) {
			return false;
		}
		int numerosDeDivisores = 1;
		int candidatoADivisor = 2;
		
		while (candidatoADivisor <= x) {
			if (x % candidatoADivisor == 0) {
				numerosDeDivisores += 1;
				candidatoADivisor += 1;
			}
		}
		if (numerosDeDivisores == 2) {
			return true;
		}else {
			return false;
		}
	}	
}
