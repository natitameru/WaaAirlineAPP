package edu.mum.cs545.controller;

import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class FlightHelper {

	private Date datetimeFrom, datetimeTo;
	public FlightHelper(){}

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
