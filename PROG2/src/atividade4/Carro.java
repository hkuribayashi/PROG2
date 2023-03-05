package atividade4;

public class Carro extends Veiculo {

	protected String placa;
	protected Boolean ligado = false;
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
}
