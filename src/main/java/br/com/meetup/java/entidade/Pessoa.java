package br.com.meetup.java.entidade;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {

	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
