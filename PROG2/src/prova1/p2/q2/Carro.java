package prova1.p2.q2;

public class Carro {

	private int anoFabricacao;
	private Motor motor;
	private Pessoa proprietario;
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Pessoa getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
}