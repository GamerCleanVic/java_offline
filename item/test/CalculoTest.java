package item.test;

import item.Calculo;

public class CalculoTest {
	public static void main (String[] args) {
		Calculo c = new Calculo(2, 5);
		
		System.out.println(c.x+" elevado a "+c.n+" = "+c.result);
	}
}
