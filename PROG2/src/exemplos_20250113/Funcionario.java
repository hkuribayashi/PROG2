package exemplos_20250113;

public abstract class Funcionario {

	protected String nome;
	
	protected Double salario;
	
	public Funcionario(String n, Double s) {
		this.nome = n;
		this.salario = s;
	}
	
	public abstract Double calcularTempoDeFerias();
	
	public Double calcularBonificacao() {
		return this.salario * 0.1;
	}
}
