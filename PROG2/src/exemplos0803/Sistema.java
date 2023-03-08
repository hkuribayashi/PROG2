package exemplos0803;

public class Sistema {

	private Double totalDeBonificacaoes;
	
	public Sistema() {
		this.totalDeBonificacaoes = 0.0;
	}
	
	public void calculaSomaBonificacoes(Funcionario f) {
		Double bonificacao = f.calcularBonificacao();
		this.totalDeBonificacaoes += bonificacao;
	}
	
	public static void main(String[] args) {
		Funcionario hugo = new Funcionario("Hugo", 100.0);
		Gerente ana = new Gerente("Ana", 100.0);
		Desenvolvedor rui = new Desenvolvedor("Rui", 100.0);
		
		Sistema s = new Sistema();
		s.calculaSomaBonificacoes(hugo);
		System.out.println(s.totalDeBonificacaoes);
		
		s.calculaSomaBonificacoes(ana);
		System.out.println(s.totalDeBonificacaoes);
		
		s.calculaSomaBonificacoes(rui);
		System.out.println(s.totalDeBonificacaoes);
		
		Funcionario x = new Gerente("Xavier", 1000.0);
		System.out.println( x.calcularBonificacao() );
		
		
	}
}
