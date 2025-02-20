package item;

public class TrianguloRetangulo3 {
	public int a, b, c;
	public void carregaLados(int lado1, int lado2, int lado3){
		a = lado1;
		b = lado2;
		c = lado3;		
	}
	public int calculaPerimetro() {
		return a + b + c;
	}
	public void verificaLados() {
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
