package exemplos_20250205;

import java.util.HashMap;
import java.util.Map;

public class TestaUniversidade {

	public static void main(String[] args) {

		Map<String, Universidade> universidades = 
						new HashMap<String, Universidade>();
		
		Universidade u1 = new Universidade("Universidade Federal..", 
															"UNIFESSPA");
		universidades.put("Unifesspa", u1); 
		
		
		Universidade x = universidades.get("Unifesspa");
			
		
	}

}
