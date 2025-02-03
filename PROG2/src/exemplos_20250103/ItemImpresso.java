package exemplos_20250103;

public abstract class ItemImpresso extends Item{
	
	public ItemImpresso(String t, Double v, Autor a) {
		super(t, v, a);
	}

	public abstract Double calcularTempoEmprestimo();

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
