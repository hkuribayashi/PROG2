package exercicios;

public class Carro {
	
	public String cor;
	public String modelo;
	public Double velocidadeAtual;
	public Double velocidadeMaxima;
	public Motor motor;
	
	public Carro() {
		this.cor = "branco";
		this.modelo = "Gol";
		this.velocidadeAtual = 0.0;
		this.velocidadeMaxima = 180.0;
		this.motor = new Motor();
	}
	
	public Carro(String cor, String modelo, Motor novo) {
		this.cor = cor;
		this.modelo = modelo;
		this.motor = novo;
	}
	
	public void liga() {
		
	}
	
	public void acelera(Double qtd) {
		
	}
	
	public int pegaMarcha() {
		return 0;
	}

}






