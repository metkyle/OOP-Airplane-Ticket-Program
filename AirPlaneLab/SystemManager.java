import java.util.*;

public class SystemManager extends SeatEnum
{
    Airport airport;
    ArrayList<Airport> airportList = new ArrayList<Airport>();
    
    Airline airline;
    ArrayList<Airline> airlineList = new ArrayList<Airline>();
    
    Flight flight;
    ArrayList<Flight> flightList = new ArrayList<Flight>();
    
    FlightSection flightSection;
    ArrayList<FlightSection> sectionList = new ArrayList<FlightSection>();
    
    Seat seat;
    ArrayList<Seat> seatList = new ArrayList<Seat>();

    // public enum SeatClass {
    // 	first, economy, business
    // }

    public SystemManager(){
    }

    public void createAirport(String n){
	this.airport = new Airport(n);
	airportList.add(airport);
    }

    public void createAirline(String n){
	this.airline = new Airline(n);
	airlineList.add(airline);
    }

    public void createFlight(String alName, String orig, String dest, int year, int month, int day, String id){
	this.flight = new Flight(alName, orig, dest, year, month, day, id);
	flightList.add(flight);
    }

    public void findAvailableFlight(String orig, String dest){
	//	this.flightSection = new flightSection(orig, dest);
	//	sectionList.add(flightSection);
	//Find THEM FLIGHTS YO
    }
    
    public void bookSeat(String air, String fl, SeatClass s, int row, char col){
	this.seat = new Seat(air, fl, s, row, col);
	seatList.add(seat);
    }

    public void displaySystemDetails(){
	//Do something better probably
	System.out.println("Airports: " + airportList);
	System.out.println("Airlines: " + airlineList);
	System.out.println("Flights: " + flightList);
	System.out.println("Sections: " + sectionList);
	System.out.println("Seats: " + seatList);

    }
}	
    
