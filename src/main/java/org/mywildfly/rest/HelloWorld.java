package org.mywildfly.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Hello World").build();
	}
}