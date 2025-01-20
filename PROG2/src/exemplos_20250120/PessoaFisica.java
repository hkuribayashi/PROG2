package exemplos_20250120;

public class PessoaFisica extends Contribuinte{

	private Double despesasDeSaude;
	
	public PessoaFisica(String n, Double ra, 
										Double ds) {
		super(n, ra);
		this.despesasDeSaude = ds;
	}
	
	public Double getDespesasDeSaude(){
		return this.despesasDeSaude;
	}

	@Override
	public Double calculaImposto() {
		Double imposto = 0.0;
		if (this.rendaAnual < 20000.0) {
			imposto = this.rendaAnual * 0.15;
		}else {
			imposto = this.rendaAnual * 0.25;
		}
		imposto -= this.despesasDeSaude * 0.5; 
		return imposto;
	}
}
