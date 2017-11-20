public class test{

    public static void main(String[] args){
	
	SystemManager sys = new SystemManager();

	sys.createAirport("DEN");
	sys.createAirport("LON");
	sys.createAirline("FRONT");
	sys.createAirline("DELTA");
	sys.createFlight("DELTA", "DEN", "LON", 2013, 10, 10, "123");
	//sys.createSection("DELTA", "123", 2, 2, SeatClass.economy);
	sys.displaySystemDetails();
    }
}
