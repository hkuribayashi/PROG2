package exemplos_20241111;

public class Pessoa {

	public String nome;
	
	public Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void fazAniversario() {
		this.idade = this.idade + 1;
	}
	
	public String toString() {
		return "O seu nome é "+this.nome+
				" e sua idade é "+this.idade;
	}
}
