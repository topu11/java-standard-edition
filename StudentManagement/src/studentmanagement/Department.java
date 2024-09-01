package studentmanagement;

import java.util.ArrayList;

public class Department{
  private String departmentName;
  private int departmentID;
  private ArrayList<Course> courses;
  
  public void setcourses(ArrayList<Course> courses)
  {
	  this.courses=courses;
  }
  public  ArrayList<Course> getcourses()
  {
	  return this.courses;
  }
  
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
  
  
  
}
