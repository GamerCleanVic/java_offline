package item;

public class TrianguloRetangulo {	
	public void verificaLados(int a, int b, int c) {
		if(a * b * c != 0) {
			if(a*a == b*b + c*c) {
				System.out.println("É triângulo retângulo!");
			}if(b*b == a*a + c*c) {
				System.out.println("É triângulo retângulo!");
			}if(c*c == a*a + b*b) {
				System.out.println("É triângulo retângulo!");
			}
		}
	}
}
