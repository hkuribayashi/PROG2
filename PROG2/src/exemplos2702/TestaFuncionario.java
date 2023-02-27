package exemplos2702;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario hugo = new Funcionario();
		hugo.nome = "Hugo Kuribayashi";
		hugo.cpf = "1928198212";
		hugo.salario = 10000.0;
		//hugo.autentica();
		Double bon = hugo.calculaBonificacao();
		
		System.out.println("Nome do Func.:" + hugo.nome);
		System.out.println("CPF do Func.:"+ hugo.cpf);
		System.out.println("Sal. do Func."+hugo.salario);
		System.out.println("Bonificacao: "+bon);
		
		Gerente g = new Gerente();
		g.nome = "Gabriel";
		g.cpf = "1928293829";
		g.salario = 102111.0;
		g.matricula = "ADFS123";
		g.setCargaHoraria(20.0);
		g.senha = 2938212;
		
		Double bonG = g.calculaBonificacao();
		System.out.println("Bon. Ger.:"+bonG);
		
		Boolean resultado = g.autentica(123456);
		System.out.println("Resultado: "+resultado);
		
		
		
		
		
		
	}
}
