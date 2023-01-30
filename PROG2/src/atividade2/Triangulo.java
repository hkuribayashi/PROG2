package atividade2;

public class Triangulo {

	public Ponto p1;
	public Ponto p2;
	public Ponto p3;
	
	public Double calculaPerimetro() {
		Double per = this.p1.calculaDistancia(this.p2) +
				     this.p2.calculaDistancia(this.p3) +
				     this.p3.calculaDistancia(this.p1);
		
		return per;
	}
}
