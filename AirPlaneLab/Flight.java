import java.util.*;

public class Flight{

    private Airline airline;
    private String origin, dest;
    private int year, month, day;
    private String ID;

    public Flight(String name, String orig, String dest, int year, int month, int day, String id){
	this.airline = new Airline(name); //Maybe not this? do we need to make a new one?
	this.origin = orig;
	this.dest = dest;
	this.year = year;
	this.month = month;
	this.day = day;
	this.ID = id;
    }

    public String toString(){
	return "" + airline.toString() + " " + this.origin + " " + this.dest +
	    " " +this.year+ " " +this.month+ " " +this.day + " " + this.ID;
    }
}
