package exemplos_20241202;

public class TestaJornada {
	
	public static void imprime(Apresentacao a) {
		System.out.println("Dados da Apresentação");
		System.out.println("Numero: "+a.numero);
		System.out.println("Local: "+a.local);
		System.out.println("Horário: "+a.horario);
		System.out.println("Trabalho: "+a.artigo.titulo);
		System.out.println("Autor: "+a.artigo.autor.nome);
		System.out.println("Orientador: "+a.artigo.autor.orientador.nome);
		
	}


	public static void main(String[] args) {
		
		// Professor p1 = new Professor(1234, "Hugo");
		
		Discente d1 = new Discente(2323, 
				                   "Ana", 
				                   new Professor(1234, "Hugo"));
		
		Artigo a1;
		
		a1 = new Artigo(113, 
						"Titulo do meu artigo", 
						"Descrição geral do meu artigo",
						d1);
		
		Apresentacao ap1 = new Apresentacao(12, 
				 						    "Local da aprese",
				 						    "15h",
				 						    a1);
		
		imprime(ap1);
	}

}
