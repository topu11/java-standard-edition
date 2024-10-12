package learing;

public class Starting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Allah Akbar");
		
		Student student=new Student(1,"A","B");
		Student student1=new Student("A","B");
		
		Address address1=new Address(1,"feni");
		
		System.out.println(student1.getLastName());
		student1.setID(150);
		
		System.out.println(student1);
		student1.setAddress(address1);
		
		System.out.println(student1.getAddress());
		System.out.println(student1.getAddress().getCity());
	    
	} 

}
