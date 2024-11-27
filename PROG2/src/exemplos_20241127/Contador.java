package exemplos_20241127;

public class Contador {

	private Integer contagem;
	
	public Contador() {
		this.contagem = 0;
	}
	
	public void zerarContador() {
		this.contagem = 0;
	}
	
	public void incrementaContador() {
		this.contagem = this.contagem + 1;
	}
	
	public void decrementarContador() {
		this.contagem = this.contagem - 1;
	}

	public Integer getContagem() {
		return this.contagem;
	}
	
}
