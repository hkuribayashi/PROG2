package exemplos_20250210;

public class Analista extends Funcionario implements UsuarioSistema{
	
	public Analista(String nome, Double salario) {
		super(nome, salario);
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.13;
	}
	
	public Boolean login(String user, String password) {
		return true;
	}

}
