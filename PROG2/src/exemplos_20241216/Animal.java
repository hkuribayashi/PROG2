package exemplos_20241216;

public class Animal {

	protected Double peso;
	protected Double idade;
	
	public Animal(Double p) {
		this.peso = p;
	}
	
	public Double getPeso() {
		return this.peso;
	}
	
	public void corre() {
		System.out.println("Animal Correndo");
	}
}
