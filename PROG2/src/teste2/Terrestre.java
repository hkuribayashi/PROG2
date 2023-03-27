package teste2;

public class Terrestre extends Transporte{
	
	private Integer numeroDeRodas;
	private String cor;
	private String placa;

	public Terrestre(Integer cap, Integer nRodas, 
			         String c, String pl) {
		super(cap);
		this.numeroDeRodas = nRodas;
		this.cor = c;
		this.placa = pl;
		
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
		String retorno = super.toString();
		retorno += "numeroDeRoda="+this.numeroDeRodas;
		retorno += "cor="+this.cor;
		retorno += "placa="+this.placa;
		return retorno;
	}
	
	
	
}
