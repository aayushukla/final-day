package com.capgemini.bankapp.dao;

import java.util.List;

import com.capgemini.bankapp.main.BankAccount;

public interface BankAppDao {

	/*
	 * double getBalance(long accountId);
	 * 
	 * void updateBalance(long accountId, double newBalance);
	 * 
	 * boolean deleteBankAccount(long accountId);
	 * 
	 * boolean updateBankAccountDetails(int accountId, String updatedName, String
	 * updatedType);
	 * 
	 * BankAccount findBankAccount(int accountId);
	 * 
	 * List<BankAccount> findAllBankAccounts();
	 */

	void addNewBankAccount(BankAccount account);

}
