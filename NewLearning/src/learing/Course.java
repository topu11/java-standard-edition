package learing;

public class Course {
   
	private String code;
	private String Name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Course [code=" + code + ", Name=" + Name + ", getCode()=" + getCode() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Course(String code, String name) {
		super();
		this.code = code;
		Name = name;
	}
	
}
