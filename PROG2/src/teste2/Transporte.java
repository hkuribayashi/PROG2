package teste2;

public class Transporte {

	private Integer capacidade;
	
	public Transporte(Integer cap) {
		this.capacidade = cap;
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
