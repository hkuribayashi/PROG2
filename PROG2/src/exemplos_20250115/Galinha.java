package exemplos_20250115;

public class Galinha extends Ave{

	@Override
	public void bicar() {
		System.out.println("Bicando e ciscando ..");
	}

	@Override
	public void mover() {
		System.out.println("Galinha correndo...");
	}

	@Override
	public void falar() {
		System.out.println("Cocoricooo....");
	}

}
