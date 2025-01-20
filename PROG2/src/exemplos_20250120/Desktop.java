package exemplos_20250120;

import java.util.ArrayList;
import java.util.List;

public class Desktop extends Computador{

	private Integer tamanhoGabinete = 50;
	
	private List<Monitor> monitores = new ArrayList<Monitor>();
	
	public List<Monitor> getMonitores() {
		return this.monitores;
	}
}
