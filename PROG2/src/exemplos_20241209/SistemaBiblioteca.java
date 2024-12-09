package exemplos_20241209;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		
		Usuario h = new Usuario(121212, "Hugo Kuribayashi");
		
		Emprestimo e1 = new Emprestimo();
		Emprestimo e2 = new Emprestimo();
		Emprestimo e3 = new Emprestimo();
		
		h.getHistoricoEmprestimos().add(e1);
		h.getHistoricoEmprestimos().add(e2);
		h.getHistoricoEmprestimos().add(e3);
		h.getHistoricoEmprestimos().remove(e1);
		
	}
}
