package exemplos_20241216;

public class Engenheiro extends Funcionario {

	public Engenheiro(String n, String c, Double s) {
		super(n, c, s);
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.17;
	}
}
