package loop;

public class Soma {
	public int printNum1;
	public int printNum2;
	public int printSoma(int i, int j) {	
		return soma(this.printNum1 = i, this.printNum2 = j);
	}
	private int soma(int num1, int num2) {
		this.printNum1 = num1;
		this.printNum2 = num2;
		return this.printNum1 + this.printNum2;
	}
}
