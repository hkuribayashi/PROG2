package exemplos0103;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario joao = new Funcionario("Joao Silva",
										   "128192821",
										   1000.0);
		System.out.println(joao.calculaBonificacao());
		
		Gerente hugo = new Gerente("A11298", 
								   12334,
								   "Hugo Kuribayashi",
								   "29382983",
								   1000.0);
		
		System.out.println(hugo.calculaBonificacao());

	}

}
