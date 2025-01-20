package exemplos_20250120;

public class PessoaJuridica extends Contribuinte{
	
	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica(String n, Double ra, 
								Integer numero) {
		super(n, ra);
		this.numeroDeFuncionarios = numero;
	}

	@Override
	public Double calculaImposto() {
		Double taxa = 0.16;
		if (this.numeroDeFuncionarios > 10)
			taxa = 0.14;
		return this.rendaAnual * taxa;
	}

	
}
