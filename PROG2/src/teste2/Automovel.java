package teste2;

public class Automovel extends Terrestre {
	
	private Integer numeroDePortas;

	public Automovel(Integer cap, Integer nRodas, 
								String c, String pl, 
								Integer numPortas) {
		super(cap, nRodas, c, pl);
		this.numeroDePortas = numPortas;
	}

	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	public String toString() {
		String retorno = super.toString();
		retorno += "numeroDePortas"+this.numeroDePortas;
		return retorno;
	}
}
