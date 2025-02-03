package exemplos_20250203;

public class Editora {

	private String nome;
	private String cidade;
	
	public Editora(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Editora [nome=" + nome + ", cidade=" + cidade + "]";
	}
}
