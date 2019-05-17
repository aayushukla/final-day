package com.capgemini.bankapp.entity;

public class BankAccount {
	private int accountId;
	private String accountType;
	private String accountHolderName;
	private double accounBalance;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccounBalance() {
		return accounBalance;
	}

	public void setAccounBalance(double accounBalance) {
		this.accounBalance = accounBalance;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int accountId, String accountType, String accountHolderName, double accounBalance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accounBalance = accounBalance;
	}

}
