package exemplos_20241216;

public class Diretor extends Funcionario{

	public Diretor(String n, String c, Double s) {
		super(n, c, s);
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.2;
	}
}
