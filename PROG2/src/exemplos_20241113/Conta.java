package exemplos_20241113;

public class Conta {

	public String nomeTitular;
	
	public String agencia;
	
	public Integer numero;
	
	public Double saldo;
	
	public String dataAbertura;
	
	public Conta(String agencia, String nomeTitular, 
			Integer numeroConta, Double saldo, String data) {
		this.agencia = agencia;
		this.nomeTitular = nomeTitular;
		this.numero = numeroConta;
		this.saldo = saldo;
		this.dataAbertura = data;
	}
	
	public void deposita(Double valor) {
		if (valor > 0)
			this.saldo += valor;
		else throw new RuntimeException("Valor de deposito negativo");
	}
	
	public void sacar(Double valor) {
		if (valor > 0) {
			if (valor <= this.saldo) {
				this.saldo -= valor;
			}else throw new RuntimeException("Liso");
		} else throw new RuntimeException("Valor de saque negativo");
	}
	
	public Double calcularRendimento() {
		return this.saldo * 0.1;
	}
}







