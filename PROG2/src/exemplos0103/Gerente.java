package exemplos0103;

public class Gerente extends Funcionario {
	
	protected String matricula;
	protected Integer senha;

	public Gerente(String m, 
				   Integer sen, 
				   String n, 
				   String c, 
				   Double s) {
		super(n, c, s);
		this.matricula = m;
		this.senha = sen;
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.15;
	}
}
