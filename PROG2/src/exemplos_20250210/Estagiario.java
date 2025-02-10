package exemplos_20250210;

public class Estagiario extends Pessoa implements UsuarioSistema{

	private Double valorBolsa;
	
	public Estagiario(String nome, Double valorBolsa) {
		super(nome);
		this.valorBolsa = valorBolsa;
	}
	
	public Boolean login(String user, String password) {
		return true;
	}
}
