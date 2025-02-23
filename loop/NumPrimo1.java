package loop;

public class NumPrimo1 {
	public void verificaSeEPrimo() {
		for (int primo = 2; primo <= 50; primo++) {
			if(primo%primo == 0 && primo%1 == 0) {
				System.out.println("O nº "+primo+" é primo!");				
			}else{
				System.out.println("->");
			}
		}
	}	
}
