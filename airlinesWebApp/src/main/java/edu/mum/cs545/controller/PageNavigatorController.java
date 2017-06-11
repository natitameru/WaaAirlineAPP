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
	
}
