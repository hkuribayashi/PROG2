package exemplos_20241106;

public class Conta {

	public Integer numero;
	
	public Double saldo;
	
	public Double limite;
	
	public Cliente titular;
	
	public static final Double limiteMaximo = 100.0;
	
	public Conta(Integer numero, Double saldo, 
			Double limite, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.titular = titular;
	}
	
	public Conta(Integer numero, Double limite,
			Cliente titular) {
		this.numero = numero;
		this.saldo = 0.0;
		this.limite = limite;
		this.titular = titular;
	}
	
	public Boolean sacar(Double valor) {
		if (valor > 0) {
			
			if (valor <= this.saldo) {
				this.saldo -= valor;
				return true;
			}else if (valor <= this.saldo + this.limite) {
				valor -= this.saldo;
				this.saldo = 0.0;
				this.limite -= valor;
				return true;
				
			}else return false;
			
		} else return false;
	}
	
	public Boolean deposita(Double quantidade) {
		if (quantidade > 0) {	
			if (this.limite < Conta.limiteMaximo) {
				Double diferenca = Conta.limiteMaximo 
												- this.limite;
				if (diferenca < quantidade) {
					this.limite = Conta.limiteMaximo;
					quantidade -= diferenca;
					this.saldo += quantidade;
					return true;
				}else {
					this.limite += quantidade;
					return true;
				}
			}else {
				this.saldo += quantidade;
				return true;
			}
			
		}else return false;
	}
	
	public Boolean transfere(Double valor, Conta destino) {
		this.sacar(valor);
		destino.deposita(valor);
		return true;
	}
	
	
	
	
	
	
	
	
}
