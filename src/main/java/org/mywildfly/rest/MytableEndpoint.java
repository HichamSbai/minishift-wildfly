package org.mywildfly.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.mywildfly.model.Mytable;

/**
 * 
 */
@Stateless
@Path("/mytables")
public class MytableEndpoint {

	@GET
	@Produces("application/json")
	public List<Mytable> listAll(@QueryParam("start") Integer startPosition, @QueryParam("max") Integer maxResult) {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target("http://mywildflyjpa:8080/rest/mytables");
		Response response = target.request().get();
		List<Mytable> responseEntityList = response.readEntity(new GenericType<List<Mytable>>() {
		});
		response.close();
		return responseEntityList;
	}

}
