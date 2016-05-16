package br.com.meetup.java.test;

import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

public class Teste extends JerseyTest{

 
	@Override
	protected AppDescriptor configure() {
		return new WebAppDescriptor.Builder().build();
	}
 
	
	@Test
	public void teste() throws JSONException,
			URISyntaxException {
		WebResource webResource = client().resource("http://localhost:8080/");
		JSONObject json = webResource.path("teste02/rest/pessoa/get")
				.get(JSONObject.class);
		assertEquals("Geeh", json.get("nome"));
	}

}
