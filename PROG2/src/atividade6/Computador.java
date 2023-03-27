package atividade6;

public abstract class Computador extends Produto{

	protected String marca;
	protected Integer memoriaRAM;
	protected String placaGrafica;
	
	public Computador(Double preco, String marca, Integer memoriaRAM, String placaGrafica) {
		super(preco);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.placaGrafica = placaGrafica;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Integer getMemoriaRAM() {
		return memoriaRAM;
	}
	
	public void setMemoriaRAM(Integer memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	
	public String getPlacaGrafica() {
		return placaGrafica;
	}
	
	public void setPlacaGrafica(String placaGrafica) {
		this.placaGrafica = placaGrafica;
	}
	
	@Override
	public String toString() {
		String retorno = "preco="+this.getPreco()+", ";
		retorno += "marca="+this.marca+", ";
		retorno += "memoriaRAM="+this.memoriaRAM+", ";
		retorno += "placaGrafica="+this.placaGrafica;
		return retorno;
	}
}
