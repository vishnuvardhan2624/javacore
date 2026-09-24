package constructors;

public class Bank {
	
	int accountnumber;
	String customerName;
	String accountType;
	double balance;
	
	Bank(int accountnumber,String customerName,String accountType,double balance){
		
		this.accountnumber=accountnumber;
		this.customerName=customerName;
		this.accountType=accountType;
		this.balance=balance;
	}
	
	void displayDetails() {
		System.out.println("account  number is:"+accountnumber);
		System.out.println("the customer name is:"+customerName);
		System.out.println("accout type:"+accountType);
		System.out.println("balance int the account is:"+balance);
		
		System.out.println("---------------------------------------------");
	}

	public static void main(String[] args) {
		
		Bank b1 = new Bank(10,"vishnu","savings",20000);
		
		Bank b2 = new Bank(20,"goutham","current",30000);
		
		Bank b3 = new Bank(30,"prajwal","savings",40000);
		
		
	    b1.displayDetails();
		b2.displayDetails();
		b3.displayDetails();

	}

}
