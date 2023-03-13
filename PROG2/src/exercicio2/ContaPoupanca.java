package exercicio2;

import br.banco.sistema.Conta;

public class ContaPoupanca extends Conta{
	
	protected Double taxaRendimento;


	public ContaPoupanca(Double taxa, String t, Double s) {
		super(t, s);
		this.taxaRendimento = taxa;
	}
	
	public Double calcularRendimento() {
		return this.saldo * this.taxaRendimento;
	}

	
	
}
