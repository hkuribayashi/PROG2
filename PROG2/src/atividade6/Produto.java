package atividade6;

public abstract class Produto{

	private Double preco;
	
	public abstract Double calcularImposto();

	public Produto(Double preco) {
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
