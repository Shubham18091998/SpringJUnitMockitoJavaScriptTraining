package com.cts.beans;

public class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("Calling from Airtel");
		
	}

	@Override
	public void getData() {
		System.out.println("Getting data from Airtel");
		
	}

}
