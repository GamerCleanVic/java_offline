package item;

public class TestaRetangulo {
	public void printTestaTudo() {
		testaTudo();
	}
	
	private void testePontual(int ladoR1, int ladoR2){
		Retangulo2 r = new Retangulo2();
		r.carregaLados(ladoR1, ladoR2);
		System.out.println("[\nÁrea = "+r.calculaArea());
		if(r.calculaArea() != ladoR1 * ladoR2) {
			System.out.println("Não funciona área para lados "+ladoR1+" e "+ladoR2+"\n");
		}
		System.out.println("Perímetro = "+r.calculaPerimetro()+"\n]");
		if(r.calculaPerimetro() != 2 * (ladoR1 + ladoR2)) {
			System.out.println("Não funciona perímetro para lados "+ladoR1+" e "+ladoR2+"\n");
		}
	}
	
	private void testaTudo() {
		testePontual(10, 20);
		testePontual(1, 2);
		testePontual(3, 3);
	}
}
