package edu.mum.cs545.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;

@Named
@ApplicationScoped
public class FlightHelper {

	private Date datetimeFrom, datetimeTo;
	@Inject
	FlightService flightService;
	private String destination,departure;
	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public FlightService getFlightService() {
		return flightService;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public FlightHelper(){}

	public List<Flight> getFlightsDestination(){
		System.out.println(destination);
		List<Flight> flights=new ArrayList<Flight>();
		for(Flight f:flightService.findAll()){
			if(f.getDestination().getName().equalsIgnoreCase(destination)){
				flights.add(f);
			}
			if(destination==null){
				return flightService.findAll();
			}
		}
		return flights;
	}
	public List<Flight> getFlightsDeparture(){
		List<Flight> flights=new ArrayList<Flight>();
		for(Flight f:flightService.findAll()){
			if(f.getOrigin().getName().equalsIgnoreCase(departure)){
				flights.add(f);
			}
			if(departure==null){
				return flightService.findAll();
			}
		}
		return flights;
	}
	public Date getDatetimeFrom() {
		return datetimeFrom;
	}

	public void setDatetimeFrom(Date datetimeFrom) {
		this.datetimeFrom = datetimeFrom;
	}

	public Date getDatetimeTo() {
		return datetimeTo;
	}

	public void setDatetimeTo(Date datetimeTo) {
		this.datetimeTo = datetimeTo;
	}
}
