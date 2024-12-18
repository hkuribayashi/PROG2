package exemplos_20241218;

public class Funcionario {

	protected String nome;
	protected String cpf;
	protected Double salario;
	
	public Funcionario(String n, String c, Double s) {
		this.nome = n;
		this.cpf = c;
		this.salario = s;
	}
	
	public Double calculaBonificacao() {
		return this.salario * 0.1;
	}
}
