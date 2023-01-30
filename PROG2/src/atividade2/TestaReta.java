package atividade2;

public class TestaReta {

	public static void main(String[] args) {
	
		/*
		 * // y = 2x -1 Reta r1 = new Reta(2.0, -1.0); System.out.println(
		 * r1.getRepresentacao() );
		 * 
		 * Ponto p1 = new Ponto(); p1.x = 3.0; p1.y = 4.0;
		 * 
		 * Ponto p2 = new Ponto(); p2.x = 5.0; p2.y = 10.0;
		 * 
		 * // y = 3x - 5 Reta r2 = new Reta(p1, p2); System.out.println(
		 * r2.getRepresentacao() );
		 * 
		 * Ponto p3 = new Ponto(); p3.x = 2.0; p3.y = 3.0;
		 * 
		 * Boolean resultado = r1.pertenceReta(p3); System.out.println(resultado);
		 * 
		 * 
		 * Ponto p = r1.getIntersecao(r2); System.out.println(p.x);
		 * System.out.println(p.y);
		 */
		
		Reta r = new Reta(0.0, 5.0);
		Reta s = new Reta(0.0, 2.0);
		
		Ponto p = r.getIntersecao(s);
		System.out.println(p.x);
		System.out.println(p.y);
		

	}

}
