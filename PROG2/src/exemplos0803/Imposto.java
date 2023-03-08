package exemplos0803;

public class Imposto {

	private Double totalDeImpostos = 0.0;
	
	public void somaImposto(Contribuinte c) {
		Double imposto = c.calcularImposto();
		this.totalDeImpostos += imposto;
	}
	
	public static void main(String[] args) {
		Contribuinte c = new Contribuinte("Hugo", 1000.0);
		
		Contribuinte c1 = new PessoaFisica("Ana", 100.0, 100.0);
		Contribuinte c2 = new PessoaJuridica("Emp", 1000.0, 5);
		
		
		
	}
}
