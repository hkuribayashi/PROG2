package exemplos_20241104;

public class Conta {

	public Integer numero;
	
	public String nome;
	
	public Double saldo;
	
	public Double limite;
	
	public Conta(Integer XXX, String YYY, 
			     Double ZZZ, Double WWW) {
		this.numero = XXX; 
		this.nome = YYY;
		this.saldo = ZZZ;
		this.limite = WWW;
	}
	
	public Boolean saca(Double quantidade) {
		if (quantidade > this.saldo)
			return false;
		else {
			this.saldo = this.saldo - quantidade;
			return true;
		}
	}
	
	public void deposita(Double quantidade) {
		this.saldo = this.saldo + quantidade;
	}
}
