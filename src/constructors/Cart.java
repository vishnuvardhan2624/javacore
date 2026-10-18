package constructors;

public class Cart{
	
	String productname;
	double price;
	int quantity;
	double total_cost;
	
	Cart(){
		this("unknown",0.0,0,0.0);
		
	}
	Cart(String productname){
		this(productname,0.0,0,0.0);
		
	}
	Cart(String productname,double price){
		this(productname,price,0,0.0);
		
	}
	Cart(String productname,double price, int quantity){
		this(productname,price,quantity,0.0);
		
	}
	Cart(String productname, double price,int quantity,double total_cost){
		
		this.productname=productname;
		this.price=price;
		this.quantity = quantity;
		
		this.total_cost=price*quantity;
		
	}
	
	void display() {
		
		System.out.println("the product name is:"+productname);
		System.out.println("the price of the product is :"+price);
		System.out.println("what is the quantity :"+quantity);
		System.out.println("the final bill is:"+total_cost);
	}
	

  public static void main(String args[]) {
	  
	  Cart c = new Cart("headphones",1200,2);
	  
   c.display();
  
  }
}
	




