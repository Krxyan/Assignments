class d{
public static void main(String[] args)
{
//Call the default constructor to initialize the initial values for class members
DebugBox b1=new DebugBox();
System.out.println("Initial values for width, length, and height are: ");
//Call the method to display data
b1.showData();
//Call the method to compute the volume with initial values
double vol1 = b1.getVolume();
//Printthe volume
System.out.println("The volume computed for intial width, length and heightis: "+vol1);
//Call the parameterized constructor to initialize the values for class members
DebugBox b2=new DebugBox(5, 9, 2);
System.out.println("Updated values for width, length, and height are: ");
//Call the method to display data
b2.showData();
//Call the method to compute the volume with updated values
double vol2 = b2.getVolume();
//Printthe volume
System.out.println("The volume computed for specified width, length and heightis: "+vol2);
}
}