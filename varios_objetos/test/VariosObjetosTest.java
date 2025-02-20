package varios_objetos.test;

import varios_objetos.Prisma;
import varios_objetos.Quadrado;
import varios_objetos.TrianguloRetangulo;

public class VariosObjetosTest {
	public static void main (String[] args) {
		Quadrado q = new Quadrado();
		TrianguloRetangulo tr = new TrianguloRetangulo();
		Prisma prismaBaseQuadrada = new Prisma();
		Prisma prismaBaseTriangular = new Prisma();
		
		q.lado(10.0);
		tr.cateto1(20.0);
		tr.cateto2(20.0);
		
		prismaBaseQuadrada.altura(3.0);
		prismaBaseTriangular.altura(1.0);
		
		prismaBaseQuadrada.areaDaBase(q.area());
		prismaBaseTriangular.areaDaBase(tr.area());
		
		if(prismaBaseQuadrada.volume() > prismaBaseTriangular.volume()) {
			System.out.println("O prisma de base quadrada tem maior volume!");
		}else if(prismaBaseTriangular.volume() > prismaBaseQuadrada.volume()) {
			System.out.println("O prisma de base triangular tem maior volume!");
		}else{
			System.out.println("Ambos os prismas têm o mesmo volume!");
		}
	}
}
