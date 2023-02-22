package prova1.q1;

public class Navio {

	private String fabricante;
	private double velocidadeAtual;
	private static int contador = 0;
	
	public Navio(String novoFabricante) {
		this.fabricante = novoFabricante;
		this.velocidadeAtual = 0.0;
		Navio.contador += 1;
	}
	
	public Navio(String novoFabricante, double novaVelocidade ) {
		this.fabricante = novoFabricante;
		this.velocidadeAtual = novaVelocidade;
		Navio.contador += 1;
	}
	
	public void aumentarVelocidade() {
		this.velocidadeAtual += 1.0;
	}
	
	public void reduzirVelocidade() {
		this.velocidadeAtual -= 1.0;
	}
	
	public static int getContador() {
		return Navio.contador;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public double getVelocidadeAtual() {
		return this.velocidadeAtual;
	}
	
	public void setFabricante(String novoFabricante) {
		this.fabricante = novoFabricante;
	}
}
