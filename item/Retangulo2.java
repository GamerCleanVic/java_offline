package item;

public class Retangulo2 {
	int lado1;
	int lado2;
	
	public int calculaArea() {
		return lado1 * lado2;
	}
	public int calculaPerimetro() {
		return 2 * (lado1 + lado2);
	}
	
	public void carregaLados(int l1, int l2){
		lado1 = l1;
		lado2 = l2;
	}
}
