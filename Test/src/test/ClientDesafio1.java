package test;

import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class ClientDesafio1 {

	public static void main(String args[]) {
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/test/rest/hello/xml");
		ClientResponse clientResponse =  webResource.accept(MediaType.TEXT_XML).get(ClientResponse.class);
		System.out.println(clientResponse.getEntity(String.class));		
	}
}