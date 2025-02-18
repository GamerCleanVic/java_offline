package conversor.test;

import conversor.Conversor;

public class ConversorTest {
	public static void main(String[] args) {
		Conversor c1 = new Conversor();
		System.out.println(c1.celciusParaFahrenheit()+"° F");
		
		//A resposta certa é cerca de 40° C em Fahrenheit
		if(c1.celciusParaFahrenheit() == 104) {
			System.out.println("Funciona!");
		}else {
			System.out.println("Não funciona!");
		}
	}
}
