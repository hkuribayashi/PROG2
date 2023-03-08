package exemplos0803;

public class PessoaFisica extends Contribuinte{
	
	private Double despesasDeSaude;

	public PessoaFisica(String n, Double ra, Double ds) {
		super(n, ra);
		this.despesasDeSaude = ds;
	}
	
	@Override
	public Double calcularImposto() {
		Double imposto = 0.0;
		if (this.rendaAnual < 20000.0) {
			// rendaAnual é menor que 20000.0
			imposto = this.rendaAnual * 0.15;
		}else {
			// rendaAnual é maior ou igual a 20000.0
			imposto = this.rendaAnual * 0.25;
		}
		
		if (this.despesasDeSaude > 0.0) {
			Double desconto = this.despesasDeSaude * 0.5;
			imposto -= desconto;
		}
	
		return imposto;
	}

}
