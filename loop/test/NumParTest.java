package loop.test;

import loop.NumPar;

public class NumParTest {
	public static void main(String[] args) {
		NumPar np = new NumPar();
		int aux = 5;
		if (aux < 0) {
			System.out.println("Digite um nº >= 0!");
		}else {
			np.verificaPar(aux);
		}
	}
}
