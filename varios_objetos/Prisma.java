package varios_objetos;

public class Prisma {
	double altura;
	double areaDaBase;
	
	public void altura(double a) {
		altura = a;
	}
	public void areaDaBase(double a) {
		areaDaBase = a;
	}
	public double volume() {
		return altura * areaDaBase;
	}
}