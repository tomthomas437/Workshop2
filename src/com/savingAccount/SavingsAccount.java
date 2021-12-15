package com.savingAccount;

public class SavingsAccount {
	
	static private double annualInterestRate;
    private double savingBalance;
    
    public SavingsAccount(double savingBalance)
    {
            this.savingBalance=savingBalance;
    }
    
    public double getSavingBalance()
    {
            return this.savingBalance;
    }
    
     // Modify annual interest
    public static void modifyInterestRate(double newInterestRate)
    {
            annualInterestRate=newInterestRate;
    }
    
    public static void setAnnualInterestRate(double newInterestRate)
    {
            annualInterestRate=newInterestRate;
    }
    
    
  // Calculate monthly interest 
    public void calculateMonthlyInterest()
    {
            double monthlyI= (double)(this.savingBalance*(annualInterestRate/100)/12);
            this.savingBalance+=monthlyI;
    }
    
}
