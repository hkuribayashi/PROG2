package exemplos_20250210;

public class Desenvolvedor extends Funcionario implements 
												UsuarioSistema{
	
	public Desenvolvedor(String nome, Double salario) {
		super(nome, salario);
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.12;
	}
	
	public Boolean login(String user, String password) {
		return true;
	}

}
