package EncapsulationDemo;

public class Professor {
	// get the value or update the value
	// get or set
	private int profId; // get - no, set - no
	private String profName; // get - yes, set - yes
	private float salary; // get-yes, set-no
	private String collegeName; // get - yes, set-no
	private long phoneNumber; // get-yes, set - yes
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public float getSalary() {
		return salary;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public int getProfId() {
		return profId;
	}
	public void givesAssignmnet() {
		System.out.println(profId);
		System.out.println(profName);
		System.out.println(salary);
		System.out.println(collegeName);
		System.out.println(phoneNumber);
	}

	

}
