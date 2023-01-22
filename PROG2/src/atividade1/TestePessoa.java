package atividade1;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("João", 20);
		p1.idade = 20;
		p1.nome = "Joana";
		
		p1.fazAniversario();

		System.out.println("O seu nome é: "+p1.nome);
		System.out.println("A sua idade é: "+p1.idade);
		
		Pessoa p2 = new Pessoa("Maria", 28);
		System.out.println("O seu nome é: "+p2.nome);
		System.out.println("A sua idade é: "+p2.idade);

	}
}
