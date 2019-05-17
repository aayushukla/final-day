package com.capgemini.bankapp.entity;

public class CurrentAccount {
	double odLimit;

	public CurrentAccount(double odLimit) {
		super();
		this.odLimit = odLimit;
	}

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

}
