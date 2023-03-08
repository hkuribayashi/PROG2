package exemplos0803;

public class PessoaJuridica extends Contribuinte{
	
	private Integer numeroDeFuncionario;

	public PessoaJuridica(String n, Double ra, Integer nf) {
		super(n, ra);
		this.numeroDeFuncionario = nf;
	}
	
	public Double calcularImposto() {
		Double imposto = 0.0;
		if (this.numeroDeFuncionario >= 10 ) {
			imposto = this.rendaAnual * 0.14;
		}else {
			imposto = this.rendaAnual * 0.16;
		}
		return imposto;
	}

}
