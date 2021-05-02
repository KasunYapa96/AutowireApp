package com.hcl;

public class Address {

	private int no;
	private String city;
	private String zip;
	
	public Address() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return no+"\t"+city+"\t"+zip;
	}
	
	
	
}
