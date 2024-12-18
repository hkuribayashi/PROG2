package exemplos_20241218;

public class Fraqueza {

	private Integer idFraqueza;
	
	private String nome;
	
	public Fraqueza(Integer idFraqueza, String nome) {
		this.idFraqueza = idFraqueza;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Fraqueza [idFraqueza=" + idFraqueza + ", nome=" + nome + "]";
	}
}
