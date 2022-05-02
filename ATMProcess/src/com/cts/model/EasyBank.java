package com.cts.model;

import org.springframework.stereotype.Component;


@Component
public class EasyBank {

	private int pinCode=6789;
	private int balance=10000;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTempPin() {
		return tempPin;
	}
	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}
	public void doWithdraw(int amount) {
		if(amount<=balance) {
			System.out.println("You have successfully withdrawn "+amount);
			setBalance(balance-amount);
		}
		else {
			System.out.println("Insufficient Fund");
		}
	}
	public void doDeposit(int amount) {
		setBalance(balance+amount);
		System.out.println("Your balance is "+getBalance());
	}
	public void doChangePin(int oldPin,int pin) throws Exception{
		if(oldPin==getPinCode()) {
			String n_pin=String.valueOf(pin);
			if(n_pin.length()==4 || n_pin.charAt(0)=='0') {
				setPinCode(pin);
			}
			else {
				throw new Exception();
			}
		}
		else {
			throw new Exception();
		}
	}
	public void showBalance() {
		System.out.println("Your balance is "+getBalance());
	}
}
