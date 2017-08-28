package com.mybank.controller;

import com.mybank.model.Account;

public class AccountTransactionController {

	public void withdrawMoney(Account account, double amountToWithdraw) {
		account.setAmount(account.getAmount() - amountToWithdraw);
	}
	
	public void depositMoney(Account account, double amountToDeposit) {
		account.setAmount(account.getAmount() + amountToDeposit);
	}
	
	public void displayAccountAmount(Account account) {
		System.out.println("The account number " + account.getAccountID() + " contains " + account.getAmount() + " € ");
	}
	
}
