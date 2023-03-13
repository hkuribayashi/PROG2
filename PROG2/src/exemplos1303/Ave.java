package exemplos1303;

public class Ave extends Animal{

	public Ave(String n, String c, Integer i, Double p) {
		super(n, c, i, p);
	}
	
	@Override
	public void movimentar() {
		System.out.println("Ave voa");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Ave come alpiste");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Ave canta");
	}
}
