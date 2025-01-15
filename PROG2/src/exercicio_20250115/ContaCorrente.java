package exercicio_20250115;

import javax.management.RuntimeErrorException;

public class ContaCorrente extends Conta{
	
	protected Double limite;
	
	private static Double limiteMaximo = 200.0; 

	public ContaCorrente(String t, Double s) {
		super(t, s);
		this.limite = ContaCorrente.limiteMaximo;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [titular="+this.titular+
				 ", saldo="+this.saldo+
				 ", limite="+this.limite+"]";
	}

	@Override
	public void depositar(Double valor) {
		if (this.limite < ContaCorrente.limiteMaximo) {
			//Significa que o limite foi utilizado
			this.limite += valor;
		  if (this.limite > ContaCorrente.limiteMaximo) {
			  Double diff = this.limite - 
					  		 ContaCorrente.limiteMaximo;
			  this.saldo += diff;
			  this.limite -= diff;
		  }		
		}else {
			// Limite está cheio
			this.saldo += valor;
		}
	}

	@Override
	public void sacar(Double valor) {
		if (valor <= this.saldo + this.limite) {
			//É possível sacar
			if (valor <= this.saldo) {
				this.saldo -= valor;
			}else {
				valor -= this.saldo;
				this.saldo = 0.0;
				this.limite -= valor;
			}
		// Não há dinheiro suficiente
		}else throw new RuntimeException("Saldo Insufici");
	}
	
	

	
}
