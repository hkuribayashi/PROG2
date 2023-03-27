package atividade6;

public class Monitor extends Produto{
	
	private String marca;
	private Double tamanho;
	
	public Monitor(Double preco, String m, Double t) {
		super(preco);
		this.marca = m;
		this.tamanho = t;
	}

	@Override
	public Double calcularImposto() {
		return this.getPreco() * 0.1;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
}
