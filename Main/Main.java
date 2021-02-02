package it.by.Savkin.Main;

import it.by.Savkin.bean.Airline;
import it.by.Savkin.bean.NDate;
import it.by.Savkin.bean.Airport;
import it.by.Savkin.logic.*;
import it.by.Savkin.view.AirportView;

import java.util.List;
public class Main {

	public static void main(String[] args) {
		Airline a1 = new Airline(15985, "Moskow", "Boing 737", 18, 65, "We");
		Airline a2 = new Airline(15000, "St.Pi", "Boing 525", 1, 5, "Tu");
		Airline a3 = new Airline(15756, "Milan", "Airbus 111", 18, 35, "Fr");
		Airline a4 = new Airline(18957, "Rim", "Superjet 100", 19, 40, "Su");
		Airline a5 = new Airline(500, "Minsk", "Boing 737", 00, 15, "We");
		Airline a6 = new Airline(18952, "London", "Superjet 300", 11, 20, "Th");
		Airline a7 = new Airline(100, "Pekin", "Airbus a330", 01, 35, "Mo");
		Airline a8 = new Airline(586, "Chicago", "Boing 747", 23, 55, "We");
	
	
	Airport domodedovo = new Airport();
	AirportLogic airportLogic = new AirportLogic();
	domodedovo.add(a1);
	domodedovo.add(a2);
	domodedovo.add(a3);
	domodedovo.add(a4);
	domodedovo.add(a5);
	domodedovo.add(a6);
	domodedovo.add(a7);
	domodedovo.add(a8);
	
	List<Airline> airlines;
	
   airlines = airportLogic.searchDayOfWeekTime(domodedovo.getAirlines(), "We",19,15);
	
   AirportView AV = new AirportView();
   
   AV.airportPrint("Search result", airlines);
	
	
	}

}
