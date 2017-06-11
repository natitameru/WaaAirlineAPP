package edu.mum.cs545.ws;

import java.util.Date;
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
import cs545.airline.model.Airplane;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;

@Path("flight")
public class FlightWebService {
	
	@Inject
	private FlightService flightService;

	@POST
	@Consumes({ MediaType.APPLICATION_JSON})
	public void create(Flight flight) {
		flightService.create(flight);
	}

	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON})
	public void delete(Flight flight) {
		flightService.delete(flight);
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public Flight update(Flight flight) {
		return flightService.update(flight);
	}
	@GET
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public Flight find(Flight flight) {
		return flightService.find(flight);
	}

	@GET
	@Path("flightnr")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Flight> findByNumber(String flightnr) {
		return flightService.findByNumber(flightnr);
	}

	@GET
	@Path("airline")
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Flight> findByAirline(Airline airline) {
		return flightService.findByAirline(airline);
	}

	@GET
	@Path("origin")
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Flight> findByOrigin(Airport airport) {
		return flightService.findByOrigin(airport);
	}

	@GET
	@Path("destination")
	@Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Flight> findByDestination(Airport airport) {
		return flightService.findByDestination(airport);
	}

	@GET
	@Path("datetime")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Flight> findByArrival(Date datetime) {
		return flightService.findByArrival(datetime);
	}
 
//	@GET
//	@Path("arrivalbetween")
//    @Produces({ MediaType.APPLICATION_JSON})
//	public List<Flight> findByArrivalBetween(Date datetimeFrom, Date datetimeTo) {
//		return flightService.findByDepartureBetween(datetimeFrom, datetimeTo);
//	}
    
	@GET
	@Path("departure")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Flight> findByDeparture(Date datetime) {
		return flightService.findByDeparture(datetime);
	}

//	@GET
//	@Path("departbetween")
//    @Produces({ MediaType.APPLICATION_JSON})
//	public List<Flight> findByDepartureBetween(Date datetimeFrom, Date datetimeTo) {
//		return flightService.findByDepartureBetween(datetimeFrom, datetimeTo);
//	}

	@GET
	@Path("all")
    @Produces({ MediaType.APPLICATION_JSON})
	public List<Flight> findAll() {
		return flightService.findAll();
	}
}
