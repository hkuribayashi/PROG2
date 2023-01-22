package atividade1;

public class Porta {

	public Boolean aberta = false;
	public Double dimensaoX = 1.8; 
	public Double dimensaoY = 2.5;
	public Double dimensaoZ = 0.1;
	public String cor = "Marrom";
	
	public Porta() {
		System.out.println("Criando uma nova porta m1");
	}
	
	public Porta (Double dimensaoX, 
				Double dimensaoY, Double dimensaoZ,
				String cor, Boolean aberta) {
		System.out.println("Criando uma nova porta m2");
		this.aberta = aberta;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
		this.cor = cor;
		
	}
	
	public void abre() {
		if (this.aberta) {
			System.out.println("Porta já estava aberta");
		}else {
			this.aberta = true;
			System.out.println("A porta foi aberta");
		}
	}
	
	public void fecha() {
		if (this.aberta) {
			this.aberta = false;
			System.out.println("Fechando a Porta");
		}else {
			System.out.println("Porta já estava fechada");
		}
	}
	
	public void pinta(String novaCor) {
		this.cor = novaCor;
	}
	
	public Boolean estaAberta() {
		return this.aberta;
	}
}









