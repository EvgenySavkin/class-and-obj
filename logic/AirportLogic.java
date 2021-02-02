package it.by.Savkin.logic;

import java.util.List;
import java.util.ArrayList;

import it.by.Savkin.bean.Airline;

public class AirportLogic {

	public List<Airline> searchDayOfWeek(List<Airline> dairline, String day) {
		ArrayList<Airline> result = new ArrayList<>();
		for (Airline curentAirline : dairline) {
			if ((curentAirline.getDepartureDayOfWeek()).equals(day))
				result.add(curentAirline);
		}

		return result;
	}
	
	public List<Airline> searchDestination(List<Airline> dairline, String destination) {
		ArrayList<Airline> result = new ArrayList<>();
		for (Airline curentAirline : dairline) {
			if ((curentAirline.getDestination()).equals(destination))
				result.add(curentAirline);
		}

		return result;
	}
	
	public List<Airline> searchDayOfWeekTime(List<Airline> dairline, String day, int hour, int min) {
		ArrayList<Airline> result = new ArrayList<>();
		for (Airline curentAirline : dairline) {
			if (((curentAirline.getDepartureDayOfWeek()).equals(day))&&(curentAirline.getDepartureTimeHours() >= hour))
				if(curentAirline.getDepartureTimeMin() > min)
				result.add(curentAirline);
		}

		return result;
	}
	
	

}
