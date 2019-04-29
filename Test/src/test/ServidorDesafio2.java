package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class ServidorDesafio2 {
    @GET
    @Path("soma/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response soma(@PathParam("a") float a, @PathParam("b") float b) {
      float resultado = a+b;
      return Response.status(200).entity(Float.toString(resultado)).build();
    }
    @GET
    @Path("sub/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response sub(@PathParam("a") float a, @PathParam("b") float b) {
      float resultado = a-b;
      return Response.status(200).entity(Float.toString(resultado)).build();
    }
    // Faça aqui multiplicação e divisão 
}
