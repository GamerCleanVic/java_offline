package conversor.test;

import conversor.Conversor4;

public class TestaConversor4 {	
	public static void main (String[] args) {
		try {
			testaTudo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static int testaTudo() {
		Conversor4 c4 = new Conversor4();
		
		double celsius = 11.0;
		double fahrenheit = 50.0;		
		if(c4.celsiusParaFahrenheit(celsius) != fahrenheit) {
			System.out.println("°C -> °F não funciona para "+celsius);
		}
		if(c4.fahrenheitParaCelsius(fahrenheit) != celsius) {
			System.out.println("°F para °C não funciona para "+fahrenheit);
		}
		
		celsius = 20.0;
		fahrenheit = 68.0;		
		if(c4.celsiusParaFahrenheit(celsius) != fahrenheit) {
			System.out.println("°C -> °F não funciona para "+celsius);
		}
		if(c4.fahrenheitParaCelsius(fahrenheit) != celsius) {
			System.out.println("°F para °C não funciona para "+fahrenheit);
		}
		
		celsius = 101.0;
		fahrenheit = 213.8;		
		if(c4.celsiusParaFahrenheit(celsius) != fahrenheit) {
			System.out.println("°C -> °F não funciona para "+celsius);
		}
		if(c4.fahrenheitParaCelsius(fahrenheit) != celsius) {
			System.out.println("°F para °C não funciona para "+fahrenheit);
		}
		
		System.out.println("Fim dos testes!");
		return 0;
	}
}
