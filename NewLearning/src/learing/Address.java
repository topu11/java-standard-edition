package learing;

public class Address {
  private int road_no;
  private String city;
  
	
	public int getRoad_no() {
		return road_no;
	}
	public void setRoad_no(int road_no) {
		this.road_no = road_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int road_no, String city) {
		super();
		this.road_no = road_no;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [road_no=" + road_no + ", city=" + city + "]";
	}
	
    
}
