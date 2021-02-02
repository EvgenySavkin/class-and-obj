package it.by.Savkin.view;

import java.util.List;


import it.by.Savkin.bean.Airline;

public class AirportView {
	
 public void airportPrint(String Message, List<Airline> airlines) {
	 System.out.println("---------" + Message + "-----------");
	 
	 for(Airline airline : airlines) {
		 System.out.println("      ******      ");
		 System.out.print("  " + " Flight Number: " + airline.getFlightNumber() +   "  ||  Destination: " + airline.getDestination() + "  ||   Plane: " + 
		 airline.getPlane() + " ||  Departure Time: " + airline.getDepartureTimeHours() + ":" + airline.getDepartureTimeMin() + " || Day: "  + airline.getDepartureDayOfWeek());
		 System.out.println();
		 System.out.println();
	 }
	 }
 }

