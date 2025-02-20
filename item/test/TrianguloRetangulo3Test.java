package item.test;

import item.TrianguloRetangulo3;

public class TrianguloRetangulo3Test {
	public static void main (String[] args) {
		TrianguloRetangulo3 tr3 = new TrianguloRetangulo3();
		tr3.carregaLados(1, 1, 1);		
		System.out.println("Perímetro = "+tr3.calculaPerimetro());
		tr3.verificaLados();
		System.out.println("");
		
		tr3.carregaLados(3, 4, 5);
		System.out.println("Perímetro = "+tr3.calculaPerimetro());
		tr3.verificaLados();
		System.out.println("");
		
		tr3.carregaLados(0, 2, 3);
		System.out.println("Perímetro = "+tr3.calculaPerimetro());
		tr3.verificaLados();
		System.out.println("");
	}
}
