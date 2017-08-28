package com.mybank.test;

import com.mybank.controller.AccountTransactionController;
import com.mybank.model.Account;
import com.mybank.model.Client;

public class AccountOperationsTest {

	public static void main(String[] args) {
		
		/*
		 * Create Client and Account objects
		 */
		Client client = new Client();
		client.setID(19888994);
		client.setName("jean-pierre");
		client.setAdress("14, Rue X, 75000 Paris");
		client.setProfession("Java developer for Finance");
		client.setMail("kata.finance@finance.fr");
		
		
		Account account = new Account();
		account.setAccountID(76780875);
		account.setType("LIVRET A");
		account.setAmount(0);
		
		// make the account recently created with the client 
		client.setAccountID(account.getAccountID());
		
		
		// display account credit after creation
		AccountTransactionController controller = new AccountTransactionController();
		controller.displayAccountAmount(account);
		
		// DEPOSIT OPERATION 
		controller.depositMoney(account, 100);
		
		// display account credit after deposit
		controller.displayAccountAmount(account);
		

		// WITHDRAWAL OPERATION
		controller.withdrawMoney(account, 10);
		
		// display account credit after withdrawal
		controller.displayAccountAmount(account);
	}
	
	
}
