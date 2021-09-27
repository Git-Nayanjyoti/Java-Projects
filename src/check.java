package EncapsulationDemo;

public class Students {

	//get the value or update the value
	//get or set
	private int studentId; //Read - n, U - no
	private String studentName; //read - ye, u - yes
	private int rollNo;			//read-yes, u-no
	private String schoolName;	//read - yes, u-no
	private long phoneNumber; //read-yes, u - yes
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		//checks
		this.studentName = studentName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getRollNo() {
		return rollNo;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void doHomework() {
		System.out.println(studentId);
	}
}