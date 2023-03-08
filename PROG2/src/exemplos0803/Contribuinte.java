package exemplos0803;

public class Contribuinte {

	protected String nome;
	protected Double rendaAnual;
	
	public Contribuinte(String n, Double ra) {
		this.nome = n;
		this.rendaAnual = ra;
	}
	
	// Método Abstrato
	public Double calcularImposto() {
		return 0.0;
	}
}
