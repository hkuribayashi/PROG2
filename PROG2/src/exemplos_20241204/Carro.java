package exemplos_20241204;

public class Carro {

	private String modelo;
	
	private static int contador = 0;
	
	public Carro(String m) {
		this.modelo = m;
		Carro.contador = Carro.contador + 1;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public static int getContador() {
		return Carro.contador;
	}
}





