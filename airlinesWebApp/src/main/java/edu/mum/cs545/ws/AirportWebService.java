package edu.mum.cs545.ws;

import java.util.List;

import javax.inject.Inject;
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

@Path("airport")
public class AirportWebService {
    @Inject
	private AirportService airportService;
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON})
	public void create(Airport airport) {
		airportService.create(airport);
	}
	
	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON})
	public void delete(Airport airport) {
		airportService.delete(airport);
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public Airport update(Airport airport) {
		return airportService.update(airport);
	}
		
	@GET
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public Airport find(Airport airport) {
		return airportService.find(airport);
	}

	@GET
	@Path("/{code}")
    @Produces({ MediaType.APPLICATION_JSON})
	public Airport findByCode(@PathParam("code")String airportcode) {
		return airportService.findByCode(airportcode);
	}

	@GET
	@Path("arrival")
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airport> findByArrival(Flight flight) {
		return airportService.findByArrival(flight);
	}

	@GET
	@Path("departure")
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airport> findByDeparture(Flight flight) {
		return airportService.findByDeparture(flight);
	}

	@GET
	@Path("city")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airport> findByCity(String city) {
		return airportService.findByCity(city);
	}

	@GET
	@Path("country")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airport> findByCountry(String country) {
		return airportService.findByCountry(country);
	}

	@GET
	@Path("name")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airport> findByName(String name) {
		return airportService.findByName(name);
	}

	@GET
	@Path("all")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airport> findAll() {
		return airportService.findAll();
	}
}
