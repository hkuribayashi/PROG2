package exemplos_20250203;

public class Professor {

	private String nome;
	private String areaAtuacao;
	
	public Professor(String nome, String areaAtuacao) {
		this.nome = nome;
		this.areaAtuacao = areaAtuacao;
	}

	public String getNome() {
		return nome;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", areaAtuacao=" + areaAtuacao + "]";
	}	
	
}
