package exemplos_20250210;

public class Gerente extends Funcionario implements UsuarioSistema{
	
	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.15;
	}
	
	public Boolean login(String user, String password) {
		return true;
	}

}
