package com.capgemini.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bankapp.main.BankAccount;
import com.capgemini.bankapp.service.BankAppService;
import com.capgemini.bankapp.service.BankAppServiceImpl;

@Controller
@RequestMapping("/mumbai")
public class BankAppController {

	@Autowired
	private BankAppService service;
	
	@RequestMapping("/")
	public String inputPage() {
		return "index";
	}
	@RequestMapping("/new")
	public String detailsPage(@RequestParam("personName") String accountHolderName,@RequestParam("accountType") String accountType ,@RequestParam("balance")double accountBalance) {
		service.addNewBankAccount(new BankAccount(accountHolderName,accountType,accountBalance));
		return "details";
	}
}
