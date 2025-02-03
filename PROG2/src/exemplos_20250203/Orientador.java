package exemplos_20250203;

public class Orientador extends Professor{

	private String areaEspecialidade;
	
	public Orientador(String nome, String areaAtuacao, 
									String areaEspecialidade) {
		super(nome, areaAtuacao);
		this.areaEspecialidade = areaEspecialidade;
	}

	public String getAreaEspecialidade() {
		return areaEspecialidade;
	}

	@Override
	public String toString() {
		return "Orientador [areaEspecialidade=" + areaEspecialidade + "]";
	}
}
