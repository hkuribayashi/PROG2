package atividade2;

public class TestaTriangulo {

	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		p1.x = 10.0;
		p1.y = 10.0;
		
		Ponto p2 = new Ponto();
		p2.x = -10.0;
		p2.y = 10.0;
		
		Ponto p3 = new Ponto();
		p3.x = -10.0;
		p3.y = -10.0;
		
		Triangulo t1 = new Triangulo();
		t1.p1 = p1;
		t1.p2 = p2;
		t1.p3 = p3;
		
		Double perimetro = t1.calculaPerimetro();
		
		System.out.println(perimetro);

	}

}
