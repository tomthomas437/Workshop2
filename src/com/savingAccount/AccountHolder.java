package com.savingAccount;
import com.savingAccount.SavingsAccount;

public class AccountHolder {
	
	 public static void main(String[] args) {
		 		        
		//Instantiate 2 saving account objects saver1 and saver2
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(5000);
		
		//Annual interest rate to 4%
        SavingsAccount.setAnnualInterestRate (4);
        
		//Calculate monthly interest 
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		//Print out the new balances for both savers
		System.out.println("This month with interest 4%:\nSaver 1 balance= "+ saver1.getSavingBalance());
		System.out.println("Saver 2 balance= "+ saver2.getSavingBalance());


		//Annual interest rate to 5%
		SavingsAccount.modifyInterestRate(5);

		//Calculate next month interest rate and print balances
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Next month with intrest rate 5%:\nSaver 1 balance= "+ saver1.getSavingBalance());
		System.out.println("Saver 2 balance= "+ saver2.getSavingBalance());

		}
	}


