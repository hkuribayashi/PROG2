package exemplos2203;

public class Loja {

	public static void main(String[] args) {
		
		Categoria c1 = new Categoria(1, "Limpeza");
		
		Produto p1 = new Produto(1, 
								 "Sabão em Pó",
								 10.0,
								 c1);
		
		Produto p2 = new Produto(2,
								 "Amaciante",
								 9.0,
								 c1);
		c1.getProdutos().add(p1);
		c1.getProdutos().add(p2);
		
	}
}
