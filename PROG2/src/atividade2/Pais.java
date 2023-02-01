package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	public String codigo;
	public String nome;
	public Integer populacao;
	public Double dimensao;
	public List<String> vizinhos;
	
	//Pais p = new Pais("BRA", "Brasil", 2000, 8773.0);
	public Pais(String c, String n, Integer p, Double d) { 
		this.codigo = c;
		this.nome = n;
		this.populacao = p;
		this.dimensao = d;
		this.vizinhos = new ArrayList<String>();
	}
	
	public Boolean verificaPais(Pais outroPais) {
		return this.vizinhos.contains( outroPais.nome );
	}
	
	public Boolean comparaPais(Pais outroPais) {
		return (this.nome == outroPais.nome);
	}
	
	public Double getDensidadePopulacional() {
		return this.populacao/this.dimensao;
	}
	
	
	
}
