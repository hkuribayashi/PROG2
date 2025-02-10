package exemplos_20250210;

public abstract class Funcionario extends Pessoa{
		
	protected Double salario;
	
	public Funcionario(String nome, Double salario) {
		super(nome);
		this.salario = salario;
	}
	
	public abstract Double calcularBonificacao();

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}