package conversor.test;

import conversor.Conversor4;

public class Conversor4Test {
	public static void main (String[] args) {
		Conversor4 cmd = new Conversor4();		
		System.out.println(cmd.celsiusParaFahrenheit(37.8)+"° F");
		System.out.println(cmd.fahrenheitParaCelsius(-20.3)+"° C");
	}
}
