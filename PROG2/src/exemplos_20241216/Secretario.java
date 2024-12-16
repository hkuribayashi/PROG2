package exemplos_20241216;

public class Secretario extends Funcionario{
	
	public Secretario(String n, String c, Double s) {
		super(n, c, s);
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.12;
	}

}
