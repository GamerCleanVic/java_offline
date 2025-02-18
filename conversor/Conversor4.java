package conversor;

public class Conversor4 {
	public double celsiusParaFahrenheit(double c) {
		return 9.0 * c / 5.0 + 32.0;
	}
	public double fahrenheitParaCelsius(double f) {
		return 5.0 * (f - 32) / 9.0;
	}
}
