package atividade1;

public class Pessoa {
	
	public String nome;
	public Integer idade;
	
	/*
	public Pessoa() {
		System.out.println("Criando uma nova Pessoa");
	}
	*/
	
	public Pessoa(String novoNome, Integer novaIdade) {
		this.nome = novoNome;
		this.idade = novaIdade;
	}
	
	public void fazAniversario() {
		this.idade += 1;
	}
}
