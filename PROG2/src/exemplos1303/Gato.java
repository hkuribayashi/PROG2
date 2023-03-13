package exemplos1303;

public class Gato extends Animal{

	public Gato(String n, String c, Integer i, Double p) {
		super(n, c, i, p);
	}
	
	@Override
	public void movimentar() {
		System.out.println("Gato corre ");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Gato come ração de gato");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Gato mia");
	}
	
	public void subirEmArvore() {
		System.out.println("Gato subindo na arvore");
	}

}
