package br.com.meetup.java.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.meetup.java.entidade.Pessoa;

@Path("/pessoa")
public class ServicePessoa {

	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa getPessoa() {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Geeh");
		return pessoa;
	}
	
	@POST
	@Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Pessoa setPessoa(Pessoa p) {
		
		return p;
	}
	

	@PUT
	@Path("/put/{nome}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Pessoa putPessoa(@PathParam("nome") String nome) {
		Pessoa p = new Pessoa();
		p.setNome("Zeze");
		p.setNome(nome);
		return p;
	}
	
}
