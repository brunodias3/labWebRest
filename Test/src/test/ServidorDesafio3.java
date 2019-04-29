package test;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import test.Track;

@Path("/json")
public class ServidorDesafio3 {

	@GET
	@Path("/beyonce/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Formation");
		track.setSinger("Beyonce");

		return track;
	}
	
	@POST
	@Path("/beyonce/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {
		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
	}
	
	// Façam o Get e o Post adaptados para retornar um aluno.
	
}