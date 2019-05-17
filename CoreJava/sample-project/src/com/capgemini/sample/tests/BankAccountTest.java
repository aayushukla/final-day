package com.capgemini.sample.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.sample.model.BankAccount;

public class BankAccountTest {
	
	private BankAccount account; 
		
	@Before
	public void setUp() {
		account= new BankAccount(102,"shukla","SAVING",35000);
			
	}
	

	@Test
	public void testBankAccountObjectIsCreatedWithDefaultConstructor() {
			BankAccount account = new BankAccount();
			assertNotNull(account);
	}
	
	@Test
	public void testBankAccountObjectIsCreatedWithParameterizedConstructor() {
			BankAccount account = new BankAccount(101,"Aayush","SAVING",23444);
			assertNotNull(account);
			assertEquals(101,account.getAccountId());
			assertEquals("Aayush",account.getAccountHolderName());
			assertEquals(23444, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testBankAccountCurrentBalance()
	{
		assertEquals(35000, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWidrawWithSufficientFund()
	{
		account.withdraw(5000);
		assertEquals(30000,account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawInsufficientFund()
	{
		account.withdraw(45000);
		assertEquals(35000, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testDeposit()
	{
		account.deposit(5000);
		assertEquals(40000, account.getAccountBalance(),0.01);
	}

}
