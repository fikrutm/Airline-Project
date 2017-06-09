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
import javax.ws.rs.core.MediaType;

import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.AirportService;

@Named
@Path("airport")
public class AirportRest {

	@Inject
	private AirportService airportService;

	@POST
	@Path("create")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void create(Airport airport) {
		airportService.create(airport);
	}

	@DELETE
	@Path("delete")
	@Consumes(MediaType.APPLICATION_XML)
	public void delete(Airport airport) {
		airportService.delete(airport);
	}

	@PUT
	@Path("update")
	@Produces(MediaType.APPLICATION_XML)
	public Airport update(Airport airport) {
		return airportService.update(airport);
	}
/*
	@GET
	@Path("list/{airport}")
	@Produces(MediaType.APPLICATION_JSON)
	public Airport find(@PathParam("airport") Airport airport) {
		return airportService.find(airport);
	}

	@GET
	@Path("list/{airportcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Airport findByCode(@PathParam("airportcode") String airportcode) {
		return airportService.findByCode(airportcode);
	}

	@GET
	@Path("listAll/{arrivalflight}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> findByArrival(@PathParam("arrivalflight") Flight flight) {
		return airportService.findByArrival(flight);
	}

	@GET
	@Path("listAll/{departureflight}")
	public List<Airport> findByDeparture(@PathParam("departureflight") Flight flight) {
		return airportService.findByDeparture(flight);
	}

	@GET
	@Path("listAll/{city}")

	public List<Airport> findByCity(@PathParam("city") String city) {
		return airportService.findByCity(city);
	}

	@GET
	@Path("listAll/{contry}")

	public List<Airport> findByCountry(@PathParam("country") String country) {
		return airportService.findByCountry(country);
	}

	@GET
	@Path("listAll/{name}")
	public List<Airport> findByName(@PathParam("name") String name) {
		return airportService.findByName(name);
	}

	@GET
	@Path("listAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> findAll() {
		return airportService.findAll();
	}
*/
}
