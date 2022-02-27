
public class EventDemo

{

public static void main(String[] args)

{


	Event event=new Event();
int guests=Event.getGuests();
String eventNumber=Event.geteventNbr();

event.setEventNumber(eventNumber);
event.setGuests(guests);

CarlysEventPriceWithMethods.displayMotto();

}

}