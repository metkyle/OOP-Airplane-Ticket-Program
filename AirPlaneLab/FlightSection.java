import java.util.*;

public class FlightSection extends SeatEnum{
    Airline airline;
    String flightID; //unique flightID associated with a flight
    int row;
    int col;
    SeatClass s; //Should be enumerator type

    public FlightSection(String airName, String fID, int rows, int cols, SeatClass s){
	airline = new Airline(airName); //prolly change
	this.flightID = fID;
	this.row = rows;
	this.col = cols;
	this.s = s;
    }

    public String toString(){
	return "" + airline.toString() + " "+this.flightID + " " + this.row + " " + this.col + " " +this.s;
    }
}
