package item.test;

import item.Retangulo1;

public class Retangulo1Test {
	public static void main (String[] args) {
		Retangulo1 r = new Retangulo1();
		
		System.out.println("Área do retângulo = "+r.calculaArea(2, 3));
		System.out.println("Perímetro do retângulo = "+r.calculaPerimetro(2, 3));
	}
}
