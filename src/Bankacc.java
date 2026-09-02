
public class Bankacc {
	
	String holder_name;
	long acc_num ;
	double balance;
	
	static  int acc_num_generater = 2000;
	{
	acc_num_generater++;
	acc_num = acc_num_generater;
	}
	
	void display() {
		System.out.println("holder_name : "+holder_name);
		System.out.println("acc_num : "+acc_num);
		System.out.println("balance : "+balance);
			
	}
	

	public static void main(String[] args) {
		
		Bankacc b1=new Bankacc();
		b1.holder_name="vishnu";
		b1.balance=200.0;
		
		b1.display();
		
		
		Bankacc b2=new Bankacc();
		b2.holder_name="goutham";
		b2.balance=300.0;
		
		b2.display();
		
		
		Bankacc b3=new Bankacc();
		b2.holder_name="prajwal";
		b2.balance=400.0;
		
		b2.display();
		
		
		
		
	}

}
