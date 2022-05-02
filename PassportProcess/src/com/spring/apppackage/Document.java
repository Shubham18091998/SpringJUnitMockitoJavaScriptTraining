package com.spring.apppackage;

public class Document {

	private String name;
	private String idProof;
	private String city;
	public Document() {
		super();
	}
	public Document(String name, String idProof, String city) {
		super();
		this.name = name;
		this.idProof = idProof;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
