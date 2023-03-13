package exemplos1303;

public class Animal {

	protected String nome;
	protected String cor;
	protected Integer idade;
	protected Double peso;
	
	public Animal (String n, String c, Integer i, Double p) {
		this.nome = n;
		this.cor = c;
		this.idade = i;
		this.peso = p;
	}
	
	public void movimentar() {
		System.out.println("Animal se movimentando...");
	}
	
	public void alimentar() {
		System.out.println("Animal se alimentando...");
	}
	
	public void fazerBarulho() {
		System.out.println("Animal fazendo barulho...");
	}
}
