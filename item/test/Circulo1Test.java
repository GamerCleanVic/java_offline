package item.test;

import item.Circulo1;

public class Circulo1Test {	
	public static void main (String[] args) {
		Circulo1 c = new Circulo1();		
		
		System.out.println("Área = "+c.calculaArea(3.0));
		System.out.println("Perímetro = "+c.calculaPerimetro(3.0));
	}
}
