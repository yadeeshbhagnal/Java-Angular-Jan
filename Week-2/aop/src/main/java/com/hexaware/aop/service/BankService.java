package com.hexaware.aop.service;

import org.springframework.stereotype.Service;

import com.hexaware.aop.exception.InsufficientFund;

@Service
public class BankService {
	
	public void login()
	{
		System.out.println("login success !!");
	}

	public void Deposit()
	{
		System.out.println("Amount deposit successful !!");
	}
	
	public void withdraw()
	{
		System.out.println("Amount withdraw successful !!");
	}
	
	public void fundTransfer()
	{
		System.out.println("Fund transfer successful !!");
	}
	
	public int checkBalance(int accno) throws InsufficientFund 
	{
		int balance= 0;
		if(accno>0)
		{
		  balance=5000;
		}
		else
		{
			throw new InsufficientFund();
		}
		return balance;
	}
}
