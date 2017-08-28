package com.mybank.model;

public class Account {

	/*
	 * INFORMATION ABOUT THE BANK ACCOUNT
	 * As it is mentioned in Client class, the account ID may be 
	 * defined as auto generated if we use a persistance layer framework
	 * to save data into database
	 */
	
	private long accountID;
	private String type; // or Enumeration ("compte courant", "livret epargne" etc)
	private double amount;
	
	
	
	//Empty Constructor
	public Account() {
		super();
	}

	//Constructor with arguements
	public Account(int accountID, String type, double amount) {
		super();
		this.accountID = accountID;
		this.type = type;
		this.amount = amount;
	}
	
	
	public long getAccountID() {
		return accountID;
	}

	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public synchronized void setAmount(double amount) {
		this.amount = amount;
	}
	
}
