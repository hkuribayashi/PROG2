package exemplos_20250120;

public abstract class Computador {

	protected String marca;
	
	protected Integer memoriaRAM;
	
	protected String placaGrafica;
	
	protected Boolean ligado = false;
	
	public void ligar() {
		System.out.println("Ligando computador...");
		this.ligado = true;
		System.out.println("Computador ligado.");
	}
	
	public void desligar() { 
		System.out.println("Desligando computador..");
		this.ligado = false;
		System.out.println("Computador desligado.");
	}

	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", memoriaRAM=" + memoriaRAM + ", placaGrafica=" + placaGrafica
				+ ", ligado=" + ligado + "]";
	}
	
	
	
}
