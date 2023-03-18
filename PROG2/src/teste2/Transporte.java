package teste2;

public class Transporte {
	
	private Integer capacidade;

	public Transporte(Integer capacidade) {
		super();
		this.capacidade = capacidade;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public String toString() {
		return "capacidade="+this.capacidade;
	}
}