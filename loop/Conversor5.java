package loop;

public class Conversor5 {
	public double celsiusParaFahrenheit(double celsius){
		return celsius * 9.0 / 5.0 + 32.0;
	}
	public double fahrenheitParaCelsius(double fahr){
		return (fahr - 32.0) * 5.0 / 9.0;
	}
	public void imprimeTabelaFahrenheitParaCelsius(double inicio, double fim) {
		double fahr = inicio;
		double celsius;
		
		while(fahr <= fim) {
			celsius = fahrenheitParaCelsius(fahr);
			System.out.println(fahr+"° F = "+celsius+"° C");
			fahr += 10.0;
		}
	}
}
