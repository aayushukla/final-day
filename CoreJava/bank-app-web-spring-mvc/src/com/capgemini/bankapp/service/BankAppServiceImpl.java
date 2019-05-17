package com.capgemini.bankapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bankapp.client.BankAccountCui;
import com.capgemini.bankapp.dao.BankAppDao;
import com.capgemini.bankapp.dao.BankAppDaoImpl;
import com.capgemini.bankapp.main.BankAccount;

@Service
public class BankAppServiceImpl implements BankAppService {

@Autowired	
BankAppDao bankappdao;
	
	//static final Logger logger= Logger.getLogger(BankAccountCui.class);

	public BankAppServiceImpl() {
		bankappdao = new BankAppDaoImpl();
	}

	/*
	 * @Override public double checkBalance(long accountId) throws
	 * BankAccountNotFoundException { double balance =
	 * bankappdao.getBalance(accountId); if (balance >= 0) return balance; throw new
	 * BankAccountNotFoundException("Bankaccount does not exist");
	 * 
	 * }
	 * 
	 * @Override public double withdraw(long accountId, double amount) throws
	 * LowBalanceException, BankAccountNotFoundException { double balance =
	 * bankappdao.getBalance(accountId); if (balance < 0) throw new
	 * BankAccountNotFoundException("Account does not exist"); if (balance >=
	 * amount) { balance -= amount; bankappdao.updateBalance(accountId, balance);
	 * DbUtil.commit(); return balance; } else throw new
	 * LowBalanceException("insufficient balance");
	 * 
	 * }
	 * 
	 * public double withdrawForFundTransfer(long accountId, double amount) throws
	 * LowBalanceException, BankAccountNotFoundException { double balance =
	 * bankappdao.getBalance(accountId); if (balance < 0) throw new
	 * BankAccountNotFoundException("Account does not exist"); if (balance >=
	 * amount) { balance -= amount; bankappdao.updateBalance(accountId, balance);
	 * return balance; } else throw new LowBalanceException("insufficient balance");
	 * 
	 * }
	 * 
	 * 
	 * @Override public double deposit(long accountId, double amount) throws
	 * BankAccountNotFoundException { double balance =
	 * bankappdao.getBalance(accountId); if (balance < 0) throw new
	 * BankAccountNotFoundException("account does not exit"); balance += amount;
	 * bankappdao.updateBalance(accountId, balance); DbUtil.commit(); return
	 * balance; }
	 * 
	 * @Override public boolean deleteBankAccount(long accountId) throws
	 * BankAccountNotFoundException { boolean
	 * result=bankappdao.deleteBankAccount(accountId); if(result) { DbUtil.commit();
	 * return result; } throw new
	 * BankAccountNotFoundException("bANK ACCOUNT DOES NOT EXIST"); }
	 * 
	 * @Override public double fundTransfer(long fromAccount, long toAccount, double
	 * amount) throws BankAccountNotFoundException,LowBalanceException { try {
	 * double balance=withdrawForFundTransfer(fromAccount, amount);
	 * deposit(toAccount, amount); DbUtil.commit(); return balance; }
	 * catch(LowBalanceException | BankAccountNotFoundException e) {
	 * logger.error("exception",e); DbUtil.rollback(); throw e; } }
	 */

	@Override
	public void addNewBankAccount(BankAccount account) {
		bankappdao.addNewBankAccount(account);
	}

	/*
	 * @Override public List<BankAccount> findAllBankAccounts() { return
	 * bankappdao.findAllBankAccounts(); }
	 * 
	 * @Override public BankAccount searchAccount(int accountId) throws
	 * BankAccountNotFoundException { BankAccount result=
	 * bankappdao.findBankAccount(accountId); if(result==null) throw new
	 * BankAccountNotFoundException("account not found"); else return result; }
	 * 
	 * @Override public boolean updateBankAccount(int accountId, String updatedName,
	 * String updatedType){ boolean result=
	 * bankappdao.updateBankAccountDetails(accountId, updatedName, updatedType);
	 * if(result) DbUtil.commit(); return result; }
	 */

}
