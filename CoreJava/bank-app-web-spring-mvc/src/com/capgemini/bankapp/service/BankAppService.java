package com.capgemini.bankapp.service;

import com.capgemini.bankapp.main.BankAccount;

public interface BankAppService {

	void addNewBankAccount(BankAccount account);

	//double withdraw(long accountId, double amount) throws LowBalanceException, BankAccountNotFoundException;

	//double checkBalance(long accountId) throws BankAccountNotFoundException;

}
