
public class TestBloodData {

	public static void main(String[] args) {
		BloodData b1 = new BloodData();
		BloodData b2 = new BloodData("A", "-");
		display(b1);
		display(b2);
	
		
	}
	
	public static void display(BloodData b) {
		System.out.println("The blood type is " + b.getBloodType() + b.getRhFactor());
	}

}
