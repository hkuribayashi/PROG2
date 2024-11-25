package exemplos_20241125;

public class TestaPais {

	public static void main(String[] args) {

		Pais p1 = new Pais("BRA", "Brasil", 8515767.049);
		p1.populacao = 210000000;
		
		Pais p2 = new Pais("ARG", "Argentina", 2323333.04);
		p2.populacao = 8000000;
		
		Pais p3 = new Pais("URU", "Uruguai", 293829.45);
		p3.populacao = 434343;
		
		Pais p4 = new Pais("COL", "Colombia", 233233.55);
		p4.populacao = 212121;
		
		// Brasil
		p1.vizinhos.add(p2);
		p1.vizinhos.add(p3);
		p1.vizinhos.add(p4);
		
		//Argentina
		p2.vizinhos.add(p1);
		p2.vizinhos.add(p3);
		
		//Uruguai
		p3.vizinhos.add(p1);
		p3.vizinhos.add(p2);
		
		//Colombia
		p4.vizinhos.add(p1);
		
		if (p1.equals(p2))
			System.out.println("Iguais");
		else System.out.println("Diferentes");
		
		
		System.out.println( p1.fazFronteira(p2) );
		
		System.out.println( p1.calculaVizinho(p2) );
	}
	
	
	
	

}
