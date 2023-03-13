package exemplos1303;

public class Cachorro extends Animal{
	
	public Cachorro(String n, String c, Integer i, Double p) {
		super(n, c, i, p);
	}
	
	@Override
	public void movimentar() {
		System.out.println("Cachorro corre/trota");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Cachorro comendo "
							+ "ração para cachoro");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Cachorro late..");
	}

}
