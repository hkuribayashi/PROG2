package atividade2;

public class Ponto {

	public Double x;
	public Double y;
	
	public Double calculaDistancia(Ponto outroPonto) {
		
		Double d = Math.pow(this.x - outroPonto.x, 2) +
					Math.pow(this.y - outroPonto.y, 2);
		
		return Math.sqrt(d);
	}
}
