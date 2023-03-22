package exemplos2203;

import java.util.Arrays;

public class Sistema {

	public static void main(String[] args) {
		
		Universidade u1 = 
				new Universidade("Universidade do Norte",
								 "UNORTE");
		
		Departamento d1 = 
			new Departamento("Departamento de Matemática",
							 "DMAT");
		
		Departamento d2 = 
			new Departamento("Departamento de Filosofia",
								 "DFIS");
		
		u1.getDepartamentos().add(d1);
		u1.getDepartamentos().add(d2);
		
		//u1.getDepartamentos().addAll(Arrays.asList(d1, d2));
		
		
		
		//System.out.println(u1.getDepartamentos().size());

	}

}
