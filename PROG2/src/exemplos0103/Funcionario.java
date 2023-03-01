package exemplos0103;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected Double salario;
	
	public Funcionario(String jujuba, String c, Double s) {
		this.nome = jujuba;
		this.cpf = c;
		this.salario = s;
	}
	
	public Double calculaBonificacao() {
		return this.salario * 0.10;
	}

}
