package exemplos_20241216;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected Double salario;
	
	public Funcionario(String n, String c, 
							Double s) {
		this.nome = n;
		this.cpf = c;
		this.salario = s;
	}
	
	public Double calculaBonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
