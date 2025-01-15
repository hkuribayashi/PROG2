package exercicio_20250115;

public abstract class Conta {

	protected String titular;
	
	protected Double saldo;
	
	public Conta(String t, Double s) {
		this.titular = t;
		this.saldo = s;
	}
	
	public abstract void sacar(Double valor);
	
	public abstract void depositar(Double valor);
	
	public String toString() {
		return "Conta [titular="+this.titular+", saldo="+this.saldo+"]";
	}
}
