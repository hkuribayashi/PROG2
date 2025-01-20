package exemplos_20250120;

public abstract class Contribuinte {

	protected String nome;
	
	protected Double rendaAnual;
	
	public Contribuinte(String n, Double ra) {
		this.nome = n;
		this.rendaAnual = ra;
	}
	
	public abstract Double calculaImposto();
}
