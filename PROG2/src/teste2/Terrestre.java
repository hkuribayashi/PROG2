package teste2;

public class Terrestre extends Transporte{

	private Integer numeroDeRodas;
	private String cor;
	private String placa;
	
	public Terrestre(Integer capacidade, Integer numeroDeRodas, String cor, String placa) {
		super(capacidade);
		this.numeroDeRodas = numeroDeRodas;
		this.cor = cor;
		this.placa = placa;
	}

	public Integer getNumeroDeRodas() {
		return numeroDeRodas;
	}

	public void setNumeroDeRodas(Integer numeroDeRodas) {
		this.numeroDeRodas = numeroDeRodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return super.toString()+", numeroDeRodas="+this.numeroDeRodas+", cor="+this.cor+", placa="+this.placa;
	}
}