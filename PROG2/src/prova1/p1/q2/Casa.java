package prova1.p1.q2;

public class Casa {

	private Endereco endereco;
	private Pessoa proprietario;
	private double valorVenda;
	private String cor;
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Pessoa getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}
	
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
}