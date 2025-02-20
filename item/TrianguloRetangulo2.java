package item;

public class TrianguloRetangulo2 {
	public void verificaLados(int a, int b, int c) {
		if(a * b * c != 0) {
			if(a*a == b*b + c*c) {
				System.out.println("É triângulo retângulo!");
			}else if(b*b == a*a + c*c) {
				System.out.println("É triângulo retângulo!");
			}else if(c*c == a*a + b*b) {
				System.out.println("É triângulo retângulo!");
			}else {
				System.out.println("Não é triângulo retângulo!");
			}
		}else {
			System.out.println("Não é triângulo pois possui lado de comprimento nulo!");
		}
	}
}
