package exemplos_20250203;

public class Mapa extends ItemImpresso{
	
	private Double alturaMapa;
	private Double larguraMapa;
	
	public Mapa(String t, Double v, Autor au, Double l, Double am){
		super(t, v, au);
		this.alturaMapa = am;
		this.larguraMapa = l;
	}

	@Override
	public Double calcularTempoEmprestimo() {
		return 1.0;
	}

	@Override
	public String toString() {
		return "Mapa [alturaMapa=" + alturaMapa + 
					  ", larguraMapa=" + larguraMapa + 
					  ", toString()=" + super.toString() + "]";
	}
}
