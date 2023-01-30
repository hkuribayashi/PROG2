package atividade2;

public class TestaPonto {

	public static void main(String[] args) {
		
		Ponto p1 = new Ponto();
		p1.x = 10.0;
		p1.y = -10.0;
		
		Ponto p2 = new Ponto();
		p2.x = 20.0;
		p2.y = -50.0;
		
		Double distancia = p1.calculaDistancia(p2);
		System.out.println(distancia);
		
		
	}
}
