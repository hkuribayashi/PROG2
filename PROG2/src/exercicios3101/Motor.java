package exercicios3101;

public class Motor {

	public double potencia;
	public String tipo;
	public boolean taLigado;
	
	public Motor(){
		this.potencia = 1000.0;
		this.tipo = "16V";
		this.taLigado = false;
	}
	
	public Motor(double novaPotencia, String novoTipo) {
		this.potencia = novaPotencia;
		this.tipo = novoTipo;
	}
}
