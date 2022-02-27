
public class Event {
	// static values
	public static int price_per_guest = 35;
	public static int cut_off = 50;
	//private nonstatic value
	@SuppressWarnings("unused")
	private static String eventNbr;
	@SuppressWarnings("unused")
	private static int nbrGuests;
	@SuppressWarnings("unused")
	private double price;
	
	//constructor
	public Event() {
		eventNbr = "Please Set";
		nbrGuests = 0;
		price = 0;
		}
	
	
	// set methods
	public void setEventNumber(String eventNbr) {
		Event.eventNbr=eventNbr;
	}
	
	
	public void setGuests(int nbrGuests) {
		Event.nbrGuests=nbrGuests;
		computePrice(nbrGuests);
		
		
	}
	private void computePrice(int nbrGuests) {
		price = (nbrGuests*price_per_guest);
}
	public static String geteventNbr()
	{
		return eventNbr;
	}
	public static int getGuests()
	{
		return nbrGuests;
	}
	// total price event 
	public double getPrice()
	{
		return price;
	}
	}
	


