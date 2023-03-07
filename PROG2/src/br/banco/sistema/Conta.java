package br.banco.sistema;

/**
 * 
 * Classe Conta do Exercicio 2 da Disciplina de PROGII (Turma SI2022)
 * 
 * @author Hugo Kuribayashi
 *
 */
public class Conta {

	/**
	 * Atributo que guarda o nome do Titular da Conta
	 */
	protected String titular;
	
	/**
	 * Atributo que guarda o saldo da Conta
	 */
	protected Double saldo;
	
	/**
	 * Método Construtor da Classe Conta
	 * @param t representa o nome do titular
	 * @param s representa o saldo inicial da conta
	 */
	public Conta(String t, Double s) {
		this.titular = t;
		if (s > 0) {
			this.saldo = s;
		}else throw new RuntimeException("O saldo inicial (s) da conta deve ser maior que zero: "+s);
	}
	
	/**
	 * Método que realiza um saque na conta, a partir do valor informado
	 * @param valor
	 */
	public void sacar(Double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}else throw new RuntimeException("Saldo Insuficiente");
	}
	
	/**
	 * Método que realiza um depósito a partir do valor informado
	 * @param valor
	 */
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Método que gera uma string com os dados de um objeto da classe conta 
	 */
	@Override
	public String toString() {
		return "Conta [titular="+this.titular+", saldo="+this.saldo+"]";
	}
}