package studentmanagement;

public class StudentAddress {
    
	private String house;
	private String zip;
	private String district;
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "StudentAddress [house=" + house + ", zip=" + zip + ", district=" + district + "]";
	}
	
	
	
}
