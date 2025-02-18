package conversor.test;

import conversor.Conversor2;

public class Conversor2Test {
	public static void main(String[] args) {
		Conversor2 c2 = new Conversor2();	
		
		//Cria 2 variáveis inteiras
		int entrada = 40;
		int resposta = 104;
		
		System.out.println(c2.celciusParaFahrenheit(entrada)+"° F");
		
		if(c2.celciusParaFahrenheit(entrada) != resposta) {
			System.out.println("Não funciona para 40!");
		}
		
		entrada = 20;
		resposta = 68;		
		if(c2.celciusParaFahrenheit(entrada) != resposta) {
			System.out.println("Não funciona para 20!");
		}
		
		entrada = 100;
		resposta = 212;		
		if(c2.celciusParaFahrenheit(entrada) != resposta) {
			System.out.println("Não funciona para 100!");
		}
		
		System.out.println("Fim dos testes!");
	}
}