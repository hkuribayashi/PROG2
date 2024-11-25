package exemplos_20241125;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Cliente(String nome, 
			String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
}
