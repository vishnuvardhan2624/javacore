package methods;

public class Recharge {
	
	double balance = 500;
	double rechargeAmount=299;
	
	void selectPlan(){
		System.out.println("the plan is:299");
		
		checkbalance();
	}
	void checkbalance() {
		
		System.out.println("check your balance:"+balance);
		processRecharge();
		
	}
	void processRecharge() {
		System.out.println("checking recharge plan");
		 
		 if (balance>=rechargeAmount) {
			 
			 System.out.println("balance is sufficient!!");
		 }
		 else {
			 System.out.println("not sufficient amount!!");
			 
		 }
		 updateBalance();
	}
	void updateBalance() {
		
		balance=balance-rechargeAmount;
		
		System.out.println("your updated balance:"+balance);
		showConfirmation();
		
	}
	void showConfirmation() {
		System.out.println("your recharge is successful");
		
	}


public static void main(String[] args) {
	 
	Recharge R = new Recharge();
	
	R.selectPlan();
	
}
}
	
