package exercicio2;

import br.banco.sistema.Conta;

public class ContaCorrente extends Conta{
	
	protected Double limite;
	public static final Double limiteMaximo = 200.0;

	public ContaCorrente(String t, Double s) {
		super(t, s);
		this.limite = ContaCorrente.limiteMaximo;
	}
	
	@Override
	public void sacar(Double valor) {
		if (valor <= this.saldo) {
			super.sacar(valor);
		}else if (valor <= this.saldo + this.limite) {
			Double diferenca = valor - this.saldo;
			this.saldo = 0.0;
			this.limite -= diferenca;
		}else throw new RuntimeException("Não tem dinheiro");
	}
	
	@Override
	public void depositar(Double valor) {
		if (this.limite < ContaCorrente.limiteMaximo) {
			Double diferenca = ContaCorrente.limiteMaximo - 
								this.limite;
			if (diferenca < valor) {
				valor -= diferenca;
				this.limite = ContaCorrente.limiteMaximo;
				this.saldo = valor;
			}else {
				this.limite += valor;
			}
		}
	}
	
	@Override
	public String toString() {
		return "["+ super.toString()+", "
				+ "	limite="+this.limite + "]";
	}

	
}
