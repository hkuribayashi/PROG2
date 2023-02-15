package exemplos1502;

public class Carro {

	private String modelo;
	private static int contador = 0;
	
	public Carro(String m) {
		this.modelo = m;
		Carro.contador += 1;
	}
	
	public static int getContador() {
		return Carro.contador;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
}
