import java.util.*;

public class Airport{

    private String airportName = "";

    public Airport(String apName){
	this.airportName = apName;
    }

    public String toString(){
	return "" + this.airportName;
    }
}
