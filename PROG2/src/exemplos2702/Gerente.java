package exemplos2702;

public class Gerente extends Funcionario{

	protected String matricula;
	protected Integer senha;
	
	public Boolean autentica(Integer senhaInformada) {
		if (this.senha == senhaInformada) {
			System.out.println("Acesso Autorizado");
			return true;
		}else {
			System.out.println("Acesso Negado");
			return false;
		}
	}
}
