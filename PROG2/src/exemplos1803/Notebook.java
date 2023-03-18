package exemplos1803;

public class Notebook extends Computador{
	
	private Double capacidadeBateria;
	private Double tamanhoTela;
	
	public Notebook(String m, Integer mr, String p, 
					Double v, Double cap, Double tam) {
		super(m, mr, p, v);
		this.capacidadeBateria = cap;
		this.tamanhoTela = tam;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(this.capacidadeBateria);
		builder.append(this.tamanhoTela);
		return builder.toString();
	}
	
	
	
	

}
