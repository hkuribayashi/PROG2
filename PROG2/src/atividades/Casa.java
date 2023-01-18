package atividades;

public class Casa {

	public String cor;
	public Porta porta1, porta2, porta3;
	public Pessoa proprietario;
	
	public Casa() {
		this.porta1 = new Porta();
		this.porta2 = new Porta();
		this.porta3 = new Porta();
		this.proprietario = new Pessoa("Ana", 30);
	}
	
	public void pintaCasa(String novaCor) {
		this.cor = novaCor;
		this.porta1.cor = novaCor;
		this.porta2.cor = novaCor;
		this.porta3.cor = novaCor;
	}
}
