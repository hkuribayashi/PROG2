package exemplos2003;

public abstract class Funcionario implements Comparable<Funcionario>{

	protected String nome;
	protected Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract Double calcularBonificacao();
}
