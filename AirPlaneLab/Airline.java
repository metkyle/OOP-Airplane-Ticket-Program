import java.util.*;

public class Airline{

    String alName = "";

    //Airlines have flights associated with them
    Flight availableFlights;
    ArrayList<Flight> flightList = new ArrayList<Flight>();

    public Airline(String name){
	this.alName = name;
	//must be < 6 characters
	//no duplicates
    }

    public String toString(){
	return "" + this.alName;
    }
}

    
