package exemplos_20250129;

import java.util.ArrayList;
import java.util.List;

public class Time {

	public String nomeTime;
	
	public List<Atleta> atletas;
	
	public Time(String n) {
		this.nomeTime = n;
		this.atletas = new ArrayList<Atleta>();
	}
}
