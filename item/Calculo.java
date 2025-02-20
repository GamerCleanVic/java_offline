package item;

public class Calculo {	
	public double x;
	public double n;
	public double result;
	
	public Calculo(double x, double n) {
			this.x = x;
			this.n = n;
			this.result = Math.pow(x, n);
	}	
}
