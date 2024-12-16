package exemplos_20241216;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Hugo", 
										"134", 
										1000.0);
		
		Funcionario f2 = new Gerente("Julia", 
								"23",
								3000.0);
		
		System.out.println( f.calculaBonificacao() );
		System.out.println( f2.calculaBonificacao() );
		
	}
}
