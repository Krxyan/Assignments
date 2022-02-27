
public class Patient {
	private String id;
	private int age;
	private BloodData bloodData;
	
	public Patient() {
		id = "0";
		age = 0;
		bloodData = new BloodData();
		
	}
	public Patient(String id, int age, String btype, String rhFactor ) {
		this.id = id;
		this.age = age;
		bloodData = new BloodData(btype,rhFactor);
	}
	public String getId() {
		
		return id;
	}
	public int getAge() {
		return age;
	}
	public BloodData getBloodData() {
		return bloodData;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBloodData(BloodData bloodData) {
		this.bloodData = bloodData;
	}
	
	
	
}
