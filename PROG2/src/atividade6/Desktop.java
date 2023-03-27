package atividade6;

import java.util.ArrayList;
import java.util.List;

public class Desktop extends Computador{

	private Integer tamanhoGabinete;
	private List<Monitor> monitores;
	
	public Desktop(Double preco, String marca, 
				  Integer memoriaRAM, String placaGrafica, 
				  Integer tamanhoGabinete) {
		super(preco, marca, memoriaRAM, placaGrafica);
		this.tamanhoGabinete = tamanhoGabinete;
		this.monitores = new ArrayList<>();
	}

	@Override
	public Double calcularImposto() {
		return this.getPreco() * 0.1;
	}

	public Integer getTamanhoGabinete() {
		return tamanhoGabinete;
	}

	public void setTamanhoGabinete(Integer tamanhoGabinete) {
		this.tamanhoGabinete = tamanhoGabinete;
	}

	public List<Monitor> getMonitores() {
		return monitores;
	}

	public void setMonitores(List<Monitor> monitores) {
		this.monitores = monitores;
	}
}
