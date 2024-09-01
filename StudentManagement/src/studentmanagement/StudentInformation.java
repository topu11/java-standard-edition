package studentmanagement;

public class StudentInformation {
	private int ID;
	private String FirstName;
	private String LastName;
	private StudentAddress StAddress;
	private Department Stdepartment;
    
	public void setStdepartment(Department Stdepartment)
	{
		this.Stdepartment=Stdepartment;
	}
	
	public Department getStdepartment()
	{
	   return Stdepartment;	
	}
	
	public StudentAddress getStAddress() {
		return StAddress;
	}
	public void setStudentAddress(StudentAddress StAddress) {
		this.StAddress = StAddress;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return this.FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
