package exemplos_20250129;

public class TestaDepartamento {

	public static void main(String[] args) {
		
		Categoria c1 = new Categoria(1, "Limpeza");
		
		Produto p1 = new Produto(12, "Sabão em Pó", 10.0, c1);
		
		c1.getProdutos().add(p1);
				
		System.out.println(p1);
		
	}
}
