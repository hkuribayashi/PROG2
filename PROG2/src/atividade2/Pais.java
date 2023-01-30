package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	public String codigo;
	public String nome;
	public Double populacao;
	public Double dimensao;
	public List<String> vizinhos;
	
	//Pais p = new Pais("BRA", "Brasil", 2000.0, 8773.0);
	public Pais(String c, String n, Double p, Double d) { 
		this.codigo = c;
		this.nome = n;
		this.populacao = p;
		this.dimensao = d;
		this.vizinhos = new ArrayList<String>();
	}
}
