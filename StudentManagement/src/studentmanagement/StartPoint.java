package studentmanagement;

import java.util.ArrayList;

public class StartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInformation student1=new StudentInformation();
		ArrayList<Course> courseList=new  ArrayList<Course>();
		Department department=new Department();
		ArrayList<String> courseNames=new  ArrayList<String>();
		
		student1.setFirstName("Touhidul");
		student1.setLastName("Islam");
		student1.setID(1104011);
		
		StudentAddress stAddress=new StudentAddress();
		stAddress.setDistrict("Pabna");
		stAddress.setHouse("12616 Touhid vila");
		stAddress.setZip("3650");
		
		student1.setStudentAddress(stAddress);
		
		Course cse141=new Course();
		cse141.setCourseID("CSE141");
		cse141.setCourseName("computer Basics");
		cse141.setCredit(3.00);
		
		Course cse142=new Course();
		cse142.setCourseID("CSE142");
		cse142.setCourseName("computer Programming");
		cse142.setCredit(3.00);
		courseList.add(cse142);
		courseList.add(cse141);
		
		department.setcourses(courseList);
		department.setDepartmentID(101);
		department.setDepartmentName("Computer Science and Engineering");
		student1.setStdepartment(department);
		
		System.out.println(student1.getStdepartment().getcourses().get(0).getCourseName());
		
		ArrayList<Course> getNewCourses=student1.getStdepartment().getcourses();
		System.out.println(getNewCourses);
		getNewCourses.forEach((singleCourse)->{
			courseNames.add(singleCourse.getCourseName());
		});
		System.out.println(student1.getStAddress().getDistrict());
		System.out.println(student1.getStAddress());
		System.out.println(student1.getFirstName());
		
		
	}

}
