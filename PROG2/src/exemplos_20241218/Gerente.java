package exemplos_20241218;

public class Gerente extends Funcionario{

	protected String matricula;
	protected String senha;
	
	public Gerente(String n, String c, Double s,
					String m, String se) {
		super(n, c, s);
		this.matricula = m;
		this.senha = se;
	}
	
	@Override
	public Double calculaBonificacao() {
		return this.salario * 0.15;
	}
}
