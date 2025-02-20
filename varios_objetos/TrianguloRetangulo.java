package varios_objetos;

public class TrianguloRetangulo {
	public double cateto1;
	public double cateto2;
	
	public void cateto1(double c) {
		cateto1 = c;
	}
	public void cateto2(double c) {
		cateto2 = c;
	}
	public double area() {
		return cateto1 * cateto2 / 2.0;
	}
}
