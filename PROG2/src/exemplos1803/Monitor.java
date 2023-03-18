package exemplos1803;

public class Monitor {

	private String marca;
	private Double tamanho;
	
	public Monitor(String marca, Double tamanho) {
		this.marca = marca;
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.marca);
		builder.append(this.tamanho);
		return builder.toString();
	}

}
