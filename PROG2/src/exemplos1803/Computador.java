package exemplos1803;

public class Computador {

	protected String marca;
	protected Integer memoriaRAM;
	protected String placaGrafica;
	protected Boolean ligado;
	protected Double valor;
	
	public Computador(String m, Integer mr, 
			         	String p, Double v) {
		this.marca = m;
		this.memoriaRAM = mr; 
		this.placaGrafica = p;
		this.ligado = false;
		this.valor = v;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.marca);
		builder.append(this.memoriaRAM);
		builder.append(this.placaGrafica);
		builder.append(this.ligado);
		builder.append(this.valor);
		return builder.toString();
	}
}
