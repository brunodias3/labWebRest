package test;

import java.util.Scanner;

import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientDesafio2 {
	public static void main(String args[]) {
		Client client = Client.create();
		System.out.println("Selecione qual operação deseja realizar:");
		System.out.println("Para soma, digite 1.\nPara subtracao, digite 2.\nPara divisao, digite 3.\nPara multiplicacao, digite 4.");
		Scanner teclado = new Scanner(System.in);
		int operacao = teclado.nextInt();
		System.out.println("Digite dois numeros para realizar a operacao");
		float a = teclado.nextFloat();
		float b = teclado.nextFloat();
		teclado.close();
		WebResource resource = null;
		if(operacao == 1) {
			resource = client.resource("http://localhost:8080/test/rest/calculadora/soma/" + Float.toString(a) + "/" + Float.toString(b));
		}
		else if(operacao == 2) {
			resource = client.resource("http://localhost:8080/test/rest/calculadora/sub/" + Float.toString(a) + "/" + Float.toString(b));
		}
		// Faca aqui divisão e multiplicação 
		ClientResponse response =  resource.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		System.out.println(response.getEntity(String.class));
	}
}
