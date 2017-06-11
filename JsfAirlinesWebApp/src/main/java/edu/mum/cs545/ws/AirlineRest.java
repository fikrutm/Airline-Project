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
/*
	@POST
	@Path("create")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String create(Airline airline) {
		try {
			airlineService.create(airline);
		} catch (Exception e){
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
	@Path("delete/{name}")
	@Consumes(MediaType.APPLICATION_XML)
	public void delete(@PathParam("name") Airline name){
		airlineService.delete(name);
		
	}
	
	@GET
	@Path("list/{airline}")
	public Airline find(@QueryParam("airline")Airline airline) {
		return airlineService.find(airline);
	}


	@GET
	@Path("list/name")
	public Airline findByName(@PathParam("name")String name) {
		return airlineService.findByName(name);
	}


	@GET
	@Path("listAll/{flight}")
	public List<Airline> findByFlight(@PathParam("flight")Flight flight) {
		return airlineService.findByFlight(flight);
	}*/

}
