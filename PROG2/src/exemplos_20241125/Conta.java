package exemplos_20241125;

public class Conta {

	private Integer numero;
	private Cliente titular;
	private Double saldo;
	
	public Conta(Integer num, Cliente titul, 
								Double sald) {
		this.numero = num;
		this.titular = titul;
		this.saldo = sald;
	}
	
	public void sacar(Double quantidade) {
		this.saldo = this.saldo - (quantidade * 1.01);
	}
	
	public void depositar(Double quantidade) {
		this.saldo = this.saldo + quantidade;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setTitular(Cliente novoCliente) {
		this.titular = novoCliente;
	}
	
}
