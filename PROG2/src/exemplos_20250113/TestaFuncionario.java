package exemplos_20250113;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Diretor d1 = new Diretor("Julia", 1000.0);
		System.out.println( d1.calcularBonificacao() );
		
		Analista a1 = new Analista("Gabriel", 1000.0);
		System.out.println( a1.calcularBonificacao() );
		
		Sistema s = new Sistema();
		s.adicionarFuncionario(d1);
		s.adicionarFuncionario(a1);
		
		s.calcularSomaBonificacoes();
		System.out.println( s.getSomaBonificacoes() );
	}
}
