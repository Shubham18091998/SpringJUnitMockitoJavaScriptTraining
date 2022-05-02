package com.cts.beans;

public class Mobile {

	private String mobileNo;
	private Sim simCard;
	public Mobile() {
		super();
	}
	public Mobile(String mobileNo, Sim simCard) {
		super();
		this.mobileNo = mobileNo;
		this.simCard = simCard;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Sim getSimCard() {
		return simCard;
	}
	public void setSimCard(Sim simCard) {
		this.simCard = simCard;
	}
	public void makeCall() {
		System.out.println(mobileNo);
		simCard.call();
	}
	public void useData() {
		System.out.println(mobileNo);
		simCard.getData();
		
	}
}
