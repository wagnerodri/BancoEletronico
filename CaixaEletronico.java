package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Account acc = new Account(1001 , "Wagner", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		BusinessAccount bacc = new BusinessAccount(1002 , "Noah" , 0.0, 500.0);
		Account acc1 = bacc;
		
		//UPCASTING
		Account acc2 = new BusinessAccount(1003, "lucca" , 1000.0 , 500.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		
		Account acc3 = new SavingsAccount(1004, "rodrigo", 1000.0 , 0.01);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			
			
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//POLIMORFISMO
		
		Account x = new Account(1020 ,"eliane" , 1000.0);
		Account y = new SavingsAccount(1023, "Evelyn" , 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
