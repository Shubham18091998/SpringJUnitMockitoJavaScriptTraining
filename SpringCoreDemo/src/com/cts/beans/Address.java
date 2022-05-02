package com.cts.beans;

public class Address {
	
	private String bldgFlatNo;
	private String road;
	private String city;
	private String state;
	public Address() {
		super();
		//System.out.println("Address Default Constructor is called");
	}
	public Address(String bldgFlatNo, String road, String city, String state) {
		super();
		//System.out.println("Address Parametrised Constructor is called");
		this.bldgFlatNo = bldgFlatNo;
		this.road = road;
		this.city = city;
		this.state = state;
	}
	public String getBldgFlatNo() {
		return bldgFlatNo;
	}
	public void setBldgFlatNo(String bldgFlatNo) {
		this.bldgFlatNo = bldgFlatNo;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "bldgFlatNo=" + bldgFlatNo + ", road=" + road + ", city=" + city + ", state=" + state;
	}
	

}
