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

import cs545.airline.model.Airplane;
import cs545.airline.model.Flight;
import cs545.airline.service.AirplaneService;

@Named
@Path("airplane")
public class AirplaneRest {
	
	@Inject
	private AirplaneService airplaneService;
	
	@GET
	@Path("listAll")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Airplane> findAll(){
		return airplaneService.findAll();
		
	}
	@POST
	@Path("create")
	@Produces(MediaType.APPLICATION_JSON)
	public void create(Airplane airplane){
		airplaneService.create(airplane);
		
	}
	@PUT
	@Path("update")
	@Produces(MediaType.APPLICATION_JSON)
	public Airplane update(Airplane airplane){
		return airplaneService.update(airplane);

	}
	@DELETE
	@Path("delete{srialNo}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void delete(@PathParam("serialNo") String serialNo){
		
		Airplane airplane = airplaneService.findBySrlnr(serialNo);
		
		airplaneService.delete(airplane);
	}
	
	/*@GET
	@Path("list/{airplane}")
	public Airplane find(@PathParam("airplane")Airplane airplane) {
		return airplaneService.find(airplane);
	}

	@GET
	@Path("list/{serialno}")
	public Airplane findBySrlnr(@PathParam("serialno")String serialno) {
		return airplaneService.findBySrlnr(serialno);
	}

	@GET
	@Path("listAll/{flight}")
	public List<Airplane> findByFlight(@PathParam("flight")Flight flight) {
		return airplaneService.findByFlight(flight);
	}

	@GET
	@Path("listAll/{model}")
	public List<Airplane> findByModel(@PathParam("model")String model) {
		return airplaneService.findByModel(model);
	}

*/		
}
