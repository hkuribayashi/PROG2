package teste2;

public class Automovel extends Terrestre{

	private Integer numeroDePortas;

	public Automovel(Integer numeroDePortas, Integer numeroDeRodas, String cor, String placa, Integer capacidade) {
		super(capacidade, numeroDeRodas, cor, placa);
		this.numeroDePortas = numeroDePortas;
	}

	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	public String toString() {
		return super.toString()+", numeroDePortas="+this.numeroDePortas;
	}
}
