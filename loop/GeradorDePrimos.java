package loop;

public class GeradorDePrimos {
	public int verificaPrimalidade(int x){
		int numeroDeDivisores = 1;
		int candidatoADivisor = 2;
		
		while (candidatoADivisor <= x) {
			if (x % candidatoADivisor == 0) {
				numeroDeDivisores = numeroDeDivisores + 1;
				candidatoADivisor = candidatoADivisor + 1;
			}
		}
		if (numeroDeDivisores == 2) {
			System.out.println(x+" é primo!");
		}else {
			System.out.println(x+" não é primo!");
		}
		return 0;
	}
}
