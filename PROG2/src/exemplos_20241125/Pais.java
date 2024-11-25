package exemplos_20241125;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	public String codigo;
	
	public String nome;
	
	public Integer populacao;
	
	public Double dimensao;
	
	public List<Pais> vizinhos;
	
	public Pais(String codigo, String nome, Double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;
		this.populacao = 0;
		this.vizinhos = new ArrayList<Pais>();
	}
	
	public Boolean equals(Pais outroPais) {
		if (this.codigo == outroPais.codigo)
			return true;
		else return false;
	}
	
	public Boolean fazFronteira(Pais outroPais) {
		return this.vizinhos.contains(outroPais);
	}
	
	public List<Pais> calculaVizinho(Pais outroPais) {
		List<Pais> intersecao = 
							new ArrayList<>(this.vizinhos);
		intersecao.retainAll(outroPais.vizinhos);
		return intersecao;
	}
	
	public String toString() {
		return this.codigo;
	}
}







