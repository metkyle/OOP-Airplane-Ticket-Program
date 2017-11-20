import java.util.*;

public class Seat extends SeatEnum{
    String airline;
    String flight;
    SeatClass s;
    int row;
    char col;

    public Seat(String aName, String fl, SeatClass s, int rows, char col){
	this. airline = aName; //Needs to change
	this.flight = fl; //Needs to change
	this.s = s;
	this.row = rows;
	this.col = col;
    }
}
