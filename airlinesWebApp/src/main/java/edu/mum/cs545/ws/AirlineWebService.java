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

import cs545.airline.model.Airline;
import cs545.airline.model.Flight;
import cs545.airline.service.AirlineService;


@Path("/airline")
public class AirlineWebService {
	
	@Inject
	private AirlineService airlineService;
	
    @POST
    @Consumes({ MediaType.APPLICATION_JSON})
	public void create(Airline airline) {
		airlineService.create(airline);
	}

    @DELETE
    @Consumes({ MediaType.APPLICATION_JSON})
	public void delete(Airline airline) {
    	airlineService.delete(airline);
	}

    @PUT
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public Airline update(Airline airline) {
		return airlineService.update(airline);
	}

    
	@GET
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public Airline find(Airline airline) {
		return airlineService.find(airline);
	}

	@GET
	@Path("/{name}")
    @Produces({ MediaType.APPLICATION_JSON})
	public Airline findByName(@PathParam("name") String name) {
		return airlineService.findByName(name);
	}

	@GET
	@Path("flight")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airline> findByFlight(Flight flight) {
		return airlineService.findByFlight(flight);
	}
	
	@GET
	@Path("all")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Airline> findAll() {
		return airlineService.findAll();
	}
}
