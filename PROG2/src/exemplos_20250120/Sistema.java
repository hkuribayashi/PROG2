package exemplos_20250120;

public class Sistema {
	
	public static Double totalDeImpostos = 0.0;
	
	public static void somaImpostos(Contribuinte c) {
		Sistema.totalDeImpostos += c.calculaImposto();
	}

	public static void main(String[] args) {
		Contribuinte c1;
		c1 = new PessoaFisica("Hugo", 1000.0, 200.0);
		Sistema.somaImpostos(c1);
		
		Contribuinte c2;
		c2 = new PessoaJuridica("Empresa", 10000.0, 20);
		Sistema.somaImpostos(c2);
		
		System.out.println( Sistema.totalDeImpostos );
	}
}
