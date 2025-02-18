package item.test;

import item.Retangulo2;

public class Retangulo2Test {
	public static void main (String[] args) {
		Retangulo2 r2 = new Retangulo2();
		
		r2.carregaLados(3, 5);;
		System.out.println("A área do retângulo = "+r2.calculaArea());
		System.out.println("A área do retângulo = "+r2.calculaPerimetro());
	}
}
