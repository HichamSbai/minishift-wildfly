package org.mywildfly.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/hello2")
public class HelloWorld2 {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("method doGet invoked").build();
	}
}