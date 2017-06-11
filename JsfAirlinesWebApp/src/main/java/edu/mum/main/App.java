package edu.mum.main;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.model.Airline;
import cs545.airline.service.AirlineService;

@Named
@ApplicationScoped
public class App {
	@Inject
	private AirlineService service;
	
	private List<Airline> airlines;
	
	public List<Airline> getAirlines(){
		airlines = service.findAll();
		
		return airlines;
	}
	
public App(){}
}
