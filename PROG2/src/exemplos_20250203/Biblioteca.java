package exemplos_20250203;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	List<ItemImpresso> impressos = 
					new ArrayList<ItemImpresso>();
	
	
	public Double calcularSomaValorItens() {
		Double soma = 0.0;
		for (ItemImpresso itemImpresso : impressos) {
			soma += itemImpresso.getValor();
		}
		return soma;
	}
	
	public void calcularTempoMedioEmprestimo() {
		Double media = 0.0;
		for (int i=0; i<this.impressos.size(); i++) {
			ItemImpresso imp = this.impressos.get(i);
			media += imp.calcularTempoEmprestimo();
		}
		media = media/this.impressos.size();
		System.out.println("Tempo Medio: "+media);
	}
	
	
}
