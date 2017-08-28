package com.mybank.model;

public class Client {

	/*
	 * INFORMATION ABOUT THE CLIENT 
	 * in case we use a persistance layer framework (such Hibernate for instance)
	 * => we will be able to mark ID as auto generated (@ID and @GeneratedValue annotations)
	 */
	private long ID;
	private String name;
	private String adress;
	private String profession;
	private String mail;
	private long accountID;
	
	//Empty Constructor
	public Client() {
		super();
	}

	//Constructor with arguements
	public Client(long iD, String name, String adress, String profession,
			String mail, long accountID) {
		super();
		ID = iD;
		this.name = name;
		this.adress = adress;
		this.profession = profession;
		this.mail = mail;
		this.accountID = accountID;
	}

	/*
	 * getters and setters
	 */
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getAccountID() {
		return accountID;
	}

	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}
	
}
