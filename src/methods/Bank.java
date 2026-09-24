package methods;

import java.util.Scanner;

public class Bank {
	static double balance = 10000;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		
		System.out.println("Enter how much amount you want to deposit:");
		double dp = sc.nextDouble();
		balance = b.deposit(dp);
		System.out.println("balance after deposit:"+balance);
		
		System.out.println("enter how much you want to withdraw:");
		double wa = sc.nextDouble();
		balance = b.withdraw(wa);
		System.out.println("balance after withdraw:"+balance);
	}
		
		 double check_balance(){
			 System.out.println("your balance:"+balance);
			 return balance;
			
	}
		
	double deposit(double dp) {
		
		if(dp>100) {
			balance = balance + dp;
		}
		else {
			System.out.println("enter sufficient amount!!!!");
		}
		return balance;
	}
		
	double withdraw(double wa) {
		
		if(wa<=balance) {
			balance = balance-wa;
		}
		else {
			System.out.println("insufficient balance!!!");
		}
	   return balance;	
	}
	
	}
		
		
	
	
			
		

		
	


