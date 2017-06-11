package edu.mum.cs545.ws;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cs545.airline.model.Airline;
import cs545.airline.model.Flight;
import cs545.airline.service.AirlineService;

@Named
@Path("airline")
public class AirlineRest {
	@Inject
	private AirlineService airlineService;

	@GET
	@Path("listAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airline> findAll() {
		List<Airline> listOfAirlines = airlineService.findAll();
		return listOfAirlines;
	}

	@POST
	@Path("create")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String create(Airline airline) {
		try {
			airlineService.create(airline);
		} catch (Exception e) {
			return "failed to create";
		}

		return "created successfull";
	}

	@PUT
	@Path("update")
	@Produces(MediaType.APPLICATION_XML)
	public Airline update(Airline airline) {
		return airlineService.update(airline);
	}

	@DELETE
	@Path("delete")
	@Consumes(MediaType.APPLICATION_XML)
	public void delete(Airline name) {
		airlineService.delete(name);
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response find(@QueryParam("airline") int id) {
		Airline airline = new Airline();
		airline.setId(id);
		airline = airlineService.find(airline);

		if (airline == null) {
			return Response.status(Response.Status.NOT_FOUND)
					.entity(String.format("Airline with id %d doesn't exist.", id)).build();
		}

		return Response.ok(airline).build();
	}

	@GET
	@Path("airlin/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Airline findByName(@PathParam("name") String name) {
		return airlineService.findByName(name);

	}

	
}
