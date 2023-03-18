package exemplos1803;

public class Desktop extends Computador{

	private Integer tamanhoGabinete;
	private Monitor monitor;
	
	public Desktop(String m, Integer mr, String p, 
					Double v, Integer tamG, Monitor mon) {
		super(m, mr, p, v);
		this.tamanhoGabinete = tamG;
		this.monitor = mon;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(this.tamanhoGabinete);
		builder.append(this.monitor.toString());
		return builder.toString();
	}
}
