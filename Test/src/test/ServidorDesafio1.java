package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/hello")
public class ServidorDesafio1 {

    @GET
    @Path("{xml}")
	@Produces(MediaType.TEXT_XML)
    public Response sayHello() {
        String output = "<oi> Hello, World! </oi>";
        return Response.status(200).entity(output).build();
    }
    // Faca aqui o hello world retornado em HTML!
}
