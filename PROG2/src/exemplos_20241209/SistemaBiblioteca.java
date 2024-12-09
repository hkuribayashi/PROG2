package exemplos_20241209;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		
		Usuario h = new Usuario(121212, "Hugo Kuribayashi");
		
		List<String> listaAutores = new ArrayList<String>();
		listaAutores.add("Fulano");
		listaAutores.add("Ciclano");
		listaAutores.add("Beltrano");
		Livro l1 = new Livro("Programando com Python",
							2024,
							Genero.FICCAO,
							listaAutores);
		
		Exemplar ex1 = new Exemplar("a515", l1);
		Exemplar ex2 = new Exemplar("a516", l1);
		Exemplar ex3 = new Exemplar("a517", l1);
		Exemplar ex4 = new Exemplar("a518", l1);
		
		//Date dataDeHoje = new Date();
		List<Exemplar> lista = List.of(ex1, ex2);
		Emprestimo e1 = new Emprestimo(new Date(), h, lista);
		
		h.getHistoricoEmprestimos().add(e1);
		
		
	}
}
