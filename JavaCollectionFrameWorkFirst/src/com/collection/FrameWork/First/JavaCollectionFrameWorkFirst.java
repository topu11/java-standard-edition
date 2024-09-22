package com.collection.FrameWork.First;

public class JavaCollectionFrameWorkFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Allah akbar"); 
		
		// Simple Int Array
		
		int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		System.out.println(numbers[2]);
		
		Student[] students=new Student[10];
		students[0]=new Student("Touhidul","islam");
		students[1]=new Student("Sharmin","islam");
		
		System.out.println(students[0].firstName);
		
		//Super Classs
		Object[] objects=new Object[5];
		
		objects[0]=new Student("Touhidul","islam");
		objects[1]=new Student("Touhidul","islam");
		objects[2]=new Book("Touhidul","islam");
		objects[3]="Aa";
		objects[4]=1223;
		
		Student st=(Student) objects[0]; 
		System.out.println(st.firstName);
	}

}
class Student
{
	public String firstName;
	public String lastName;
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getfirstName()
	{
		return this.firstName;
	}
	
}

class Book
{
	public String firstName;
	public String lastName;
	public Book(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}




