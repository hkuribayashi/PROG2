package exemplos0102;

public class Conta {

	private String titular;
	private Integer numero;
	private Double saldo;
	
	// Conta c1 = new Conta(2938, "Hugo", 100.0);
	public Conta(Integer nc, String t, Double s) {
		this.titular = t;
		this.numero = nc;
		this.saldo = s;
	}
	
	public Boolean saca(Double valor) {
		if (this.saldo >= (valor * 1.01) && valor > 0) {
			this.saldo = this.saldo - (valor * 1.01);
			return true;
		}else return false;
	}
	
	public Boolean deposita(Double valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
			return true;
		}else return false;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
}