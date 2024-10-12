package learing;

public class Student {
   private int ID;
   private String firstName;
   private String lastName;
   
   private Address address; 
   
	public Student(String firstName, String lastName) {
	
	this.firstName = firstName;
	this.lastName = lastName;
    }
	public Student() {
	
    }
	public Student(int iD, String firstName, String lastName) {
	super();
	ID = iD;
	this.firstName = firstName;
	this.lastName = lastName;
    }
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(Address address)
	{
		 this.address=address;
	}
	
	public Address getAddress()
	{
		return this.address;
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", getID()=" + getID() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
   
   
   
}
