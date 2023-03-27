package atividade6;

public class Notebook extends Computador{
	
	private Double capacidadeBateria;
	private Double tamanhoTela;

	public Notebook(Double preco, String marca, 
					Integer memoriaRAM, 
					String placaGrafica, 
					Double capacidadeBateria, 
					Double tamanhoTela) {
		super(preco, marca, memoriaRAM, placaGrafica);
		this.capacidadeBateria = capacidadeBateria;
		this.tamanhoTela = tamanhoTela;
	}

	@Override
	public Double calcularImposto() {
		return this.getPreco() * 0.05;
	}

	public Double getCapacidadeBateria() {
		return capacidadeBateria;
	}

	public void setCapacidadeBateria(Double capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}

	public Double getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(Double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
}
