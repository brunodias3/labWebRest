package test;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientDesafio3 {
	
	public static void main(String[] args) {
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/test/rest/json/beyonce/post");
		String teste = "{\"singer\":\"Beyonce\",\"title\":\"Formation\"}";
		ClientResponse clientResponse =  webResource.type("application/json").post(ClientResponse.class, teste);
		System.out.println(clientResponse.getEntity(String.class));	
		// Adaptem o cliente para a classe Aluno
	}
}
