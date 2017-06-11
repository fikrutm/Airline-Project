package edu.mum.cs545.ws;

import java.util.Date;
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

import cs545.airline.model.Airline;
import cs545.airline.model.Airplane;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;

@Named
@Path("flgiht")
public class FlightRest {
	@Inject
	private FlightService flightService;
	

	@GET
	@Path("listAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> findAll() {
		return flightService.findAll();
	}

	/*@POST
	@Path("create")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void create(Flight flight) {
		flightService.create(flight);

	}*/

	@PUT
	@Path("update")
	@Produces(MediaType.APPLICATION_XML)
	public Flight update(Flight flight) {
		return flightService.update(flight);
	}
/*
	@DELETE
	@Path("delete/{flight}")
	@Consumes(MediaType.APPLICATION_XML)
	public void delete(@PathParam("flight") Flight flight){
		
		flightService.delete(flight);
	}*/
	/*
	@GET
	@Path("flight/{byflight}")
	public Flight find(@PathParam("byflgith") Flight flight ){
		return flightService.find(flight);
	}
	
	@GET
	@Path("listAll/{flightnr}")
	public List<Flight> findByNumber(@PathParam("flightnr")String flightnr){
		return flightService.findByNumber(flightnr);
	}
	
	@GET
	@Path("listAll/{airline}")
	public List<Flight> findByAirline(@PathParam("airline")Airline airline) {
		return flightService.findByAirline(airline);
	}

	
	
	@GET
	@Path("listAll/{airportorigin}")
	public List<Flight> findByOrigin(@PathParam("airportorigin")Airport airport) {
		return flightService.findByOrigin(airport);
	}

	@GET
	@Path("listAll/{airportdestination}")
	public List<Flight> findByDestination(@PathParam("airportdestination")Airport airport) {
		return flightService.findByDestination(airport);
	}

	@GET
	@Path("listAll/{arrivalairplane}")
	public List<Flight> findByArrival(@PathParam("arrivalairplane")Airplane airplane) {
		return flightService.findByArrival(airplane);
	}

	@GET
	@Path("listAll/{arrivaldate}")
	public List<Flight> findByArrival(@PathParam("arrivaldate")Date datetime) {
		return flightService.findByArrival(datetime);
	}

	@GET
	@Path("listAll/{arrivaldatefrom}/{arrivaldateto}")
	public List<Flight> findByArrivalBetween(@PathParam("arrivaldatefrom")Date datetimeFrom, @PathParam("arrivaldateto")Date datetimeTo) {
		return flightService.findByArrivalBetween(datetimeFrom,datetimeTo);
	}

	@GET
	@Path("listAll/{departuredate}")
	public List<Flight> findByDeparture(@PathParam("departuredate")Date datetime) {
		return flightService.findByDeparture(datetime);
	}

	@GET
	@Path("listAll/{departuredatefrom}/{departuredateto}")
	public List<Flight> findByDepartureBetween(@PathParam("departurdatefrom")Date datetimeFrom, @PathParam("departuredatto")Date datetimeTo) {
		return flightService.findByDepartureBetween(datetimeFrom ,datetimeTo);
	}
	*/

}
