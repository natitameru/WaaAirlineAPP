package edu.mum.cs545.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;



@Named
@ApplicationScoped
public class PageNavigatorController {

	public PageNavigatorController(){}
	public String displayFlight(){
		
		return "allFlight";
	}
	public String airlineModule(){
		return "airlineModule";
	}
	public String displayAllAirlines(){
		return "allAirlines";
	}
	public String newAirline(){
		return "createAirline";
	}
	public String flightByDateTime(){
		return "date-time";
	}
	public String allFlightByDateTime(){
		return "allFlightByDataTime";
	}
	public String byDestination(){
		return "bydestination";
	}
	public String byDeparture(){
		return "bydeparture";
	}
}
