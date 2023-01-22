package exemplos;

public class Conta {

	public int numero;
	public double saldo;
	public double limite;
	public Cliente titular;
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado com sucesso");
			return true;
		}else {
			System.out.println("Saque não efetuado");
			return false;
		}
	}
	
	public void deposita(double valor) {
		if (valor >= 0) {
			this.saldo = this.saldo + valor;
			System.out.println("Deposito efetuado com Sucesso");
		}else System.out.println("Erro em efetuar o Deposito");
	}
	
	public boolean transfere(Conta destino, double valor) {
		if (valor >= 0) {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
			System.out.println("Transferencia efetuada com sucesso");
			return true;
		}else {
			System.out.println("Transferencia não efetuada");
			return false;
		}
	}
}
