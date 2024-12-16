package exemplos_20241216;

public class Ave extends Animal{

	public Ave(Double peso) {
		super(peso);
	}
	
	public void imprimirDadosAve() {
	   System.out.println("Peso: "+this.peso+
			   			  "Idade: "+this.idade);
	}
	
	public void voar() {
		System.out.println("Voando...");
	}
}
