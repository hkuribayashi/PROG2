package exemplos_20241202;

public class Circulo {

	public Ponto centro;
	
	public Double raio;
	
	public Circulo(Double raio, Ponto ponto) {
		if (raio > 0)
			this.raio = raio;
		else throw new RuntimeException("Raio Negativo");
		this.centro = ponto;
	}
	
	public Circulo(Double area) {
		if (area > 0)
			this.raio = Math.sqrt(area/Math.PI);
		else throw new RuntimeException("Area negativa");
		this.centro = new Ponto();
	}
	
	public void inflar(Double valor) {
		if (valor > 0)
			this.raio += valor;
		else throw new RuntimeException("Valor negativo");
	}
	
	public void reduzir(Double valor) {
		if (valor > 0)
			this.raio -= valor;
		else throw new RuntimeException("Valor negativo");
	}
	
	public void mover(Ponto novoCentro) {
		this.centro = novoCentro;
	}
	
}





