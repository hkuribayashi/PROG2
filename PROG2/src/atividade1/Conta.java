package atividade1;

public class Conta {

	public String nomeTitular;
	public Integer numero;
	public String agencia;
	public Double saldo;
	public Data dataAbertura;

	public Conta(String novoNome, Integer novoNumero,
			String novaAgencia) {
		this.nomeTitular = novoNome;
		this.numero = novoNumero;
		this.agencia = novaAgencia;
		this.saldo = 0.0;
		this.dataAbertura = new Data(23, 01, 2023);
	}

	public void deposita(Double quantia){
		if (quantia > 0) {
			this.saldo += quantia;
			System.out.println("OK");
		}else {
			System.out.println("Erro");
		}
	}

	public Double calculaRendimento(){
		return this.saldo * 0.1;
	}

	public Boolean saca(Double quantia){
		if (this.saldo >= quantia) {
			this.saldo -= quantia;
			System.out.println("OK");
			return true;
		}else {
			System.out.println("Erro");
			return false;
		}
		
	}	
	
	public String recuperaDadosImpressao() {
		String saida;
		saida = "Tit.: "+this.nomeTitular+"\n";
		saida += "Numero: "+this.numero+"\n";
		saida += "Agencia: "+this.agencia+"\n";
		saida += "Saldo: "+this.saldo+"\n";
		saida += "Data: "+this.dataAbertura.recuperaDadosParaImpressao();	
		return saida;
	}
	
	@Override
	public String toString() {
		String saida;
		saida = "Tit.: "+this.nomeTitular+"\n";
		saida += "Numero: "+this.numero+"\n";
		saida += "Agencia: "+this.agencia+"\n";
		saida += "Saldo: "+this.saldo+"\n";
		saida += "Data: "+this.dataAbertura;	
		return saida;
	}


}
