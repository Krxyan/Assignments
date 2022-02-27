public class CarInsurancePolicy
{
	private int policyNumber;
	private int numPayment;
	private String residentCity;

public CarInsurancePolicy(int num, int payments, String city)
{
	policyNumber = num;
	numPayment= payments;
	residentCity = city;
}
public CarInsurancePolicy(int num, int payments)
{
	policyNumber = num;
	numPayment = payments;
	residentCity = "Mayfield";
} 
public CarInsurancePolicy(int num)
{
	policyNumber = num;
	numPayment = 2;
	residentCity = "Mayfield";
}

	
public void display() {

	System.out.println("Policy #" + policyNumber + "." +
	numPayment + " payments annually. Driver resides in " + residentCity + ".");
}

}