package atividade2;

public class TestaPais {

	public static void main(String[] args) {
	
		Pais p = new Pais("BRA", "Brasil", 
				            2100000.0, 8732873.0);
		
		p.vizinhos.add("Argentinha");
		p.vizinhos.add("Uruguai");
		p.vizinhos.add("Paraguai");
		
		System.out.println( p.vizinhos.size() );
		
		Boolean r = p.vizinhos.contains("Equador");
		System.out.println(r);
		

	}

}
