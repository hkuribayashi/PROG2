package exemplos_20250210;

public class Sistema {

	public static void acessarSistema(UsuarioSistema usuario) {
		usuario.login("aaa", "aaa");
	}
	
	public static void main(String[] args) {
		
		Analista a1 = new Analista("Joazinho", 123.0);
		Desenvolvedor d1 = new Desenvolvedor("Maria", 423.0);
		Gerente g1 = new Gerente("Julia", 2332.0);
		Estagiario e1 = new Estagiario("Gabriel", 1111.0);
		Vigilante v1 = new Vigilante("Marcos", 1000.0);
		
		Sistema.acessarSistema( a1 );
		//Sistema.acessarSistema( v1 );
		Sistema.acessarSistema( e1 );
	}

}
