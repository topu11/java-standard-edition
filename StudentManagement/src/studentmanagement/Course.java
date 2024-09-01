package studentmanagement;

public class Course {
   private String courseName;
   private String courseID;
   private double credit;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + ", courseID=" + courseID + ", credit=" + credit + "]";
	}
	
    
}
