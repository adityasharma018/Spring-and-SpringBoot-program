package in.sp.beans;

public class Address {
	private int houseno;
	private String cityString;
	private int pincode;
	
	public Address(int houseno,String cityString,int pincode) {
		this.houseno=houseno;
		this.cityString=cityString;
		this.pincode=pincode;
		
	}
	@Override
	public String toString() {
		
		return "#"+houseno + ", "+cityString+ ", " +pincode;
	}
}
