package it.by.Savkin.bean;

import java.io.Serializable;


public class Airline implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private int flightNumber;
	private String destination;
	private String plane;
	private int departureTimeHours;
	private int departureTimeMin;
	private String departureDayOfWeek;
	
	public Airline() {}

	private NDate d = new NDate();
	
	public Airline (int flightNumber, String destination, String plane, int departureTimeHours,
			int departureTimeMin, String departureDayOfWeek) {
		
		
		
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.plane = plane;
		d.setHour(departureTimeHours);
		this.departureTimeHours = d.getHour();
		d.setMin(departureTimeMin);
		this.departureTimeMin = d.getMin();
		d.setDayOfWeek(departureDayOfWeek); 
		this.departureDayOfWeek = d.getDayOfWeek();
		
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public int getDepartureTimeHours() {
		return departureTimeHours;
	}

	public void setDepartureTimeHours(int departureTimeHours) {
		d.setHour(departureTimeHours);
		this.departureTimeHours = d.getHour();
		
	}

	public int getDepartureTimeMin() {
		return departureTimeMin;
	}

	public void setDepartureTimeMin(int departureTimeMin) {
		d.setMin(departureTimeMin); 
		this.departureTimeMin = d.getMin();
	}

	public String getDepartureDayOfWeek() {
		return departureDayOfWeek;
	}

	public void setDepartureDayOfWeek(String departureDayOfWeek) {
		d.setDayOfWeek(departureDayOfWeek);
		this.departureDayOfWeek = d.getDayOfWeek();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureDayOfWeek == null) ? 0 : departureDayOfWeek.hashCode());
		result = prime * result + departureTimeHours;
		result = prime * result + departureTimeMin;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((plane == null) ? 0 : plane.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (departureDayOfWeek == null) {
			if (other.departureDayOfWeek != null)
				return false;
		} else if (!departureDayOfWeek.equals(other.departureDayOfWeek))
			return false;
		if (departureTimeHours != other.departureTimeHours)
			return false;
		if (departureTimeMin != other.departureTimeMin)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (plane == null) {
			if (other.plane != null)
				return false;
		} else if (!plane.equals(other.plane))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [flightNumber=" + flightNumber + ", destination=" + destination + ", plane=" + plane
				+ ", departureTimeHours=" + departureTimeHours + ", departureTimeMin=" + departureTimeMin
				+ ", departureDayOfWeek=" + departureDayOfWeek + "]";
	}
	
	
	
}
