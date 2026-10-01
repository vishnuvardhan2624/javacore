package constructors;

import java.util.Scanner;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	
	Product(int productId,String productName,double price,int quantity){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		
	}
	Product(Product P1){
		this.productId=P1.productId;
		this.productName=P1.productName;
		this.price=P1.price;
		this.quantity=P1.quantity;
		
	}
	double calculateTotal(){
		
		return price * quantity;
		
	}
	void display() {
		System.out.println("product id is:"+productId);
		System.out.println("product name is:"+productName);
		System.out.println("quantity of the product:"+quantity);
		System.out.println("price of the productis:"+price);
		
		System.out.println("total price:"+calculateTotal());
		
		System.out.println("-------------------------------------------");
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product id");
		int id = sc.nextInt();
		
		System.out.println("enter the product name:");
		String name = sc.next();
		
		System.out.println("enter the price of the product:");
		double price = sc. nextDouble();
		
		System.out.println("enter the quantity:");
		int quantity = sc.nextInt();
		
		
		Product P1 = new Product(id,name,price,quantity);
		
		
		Product P2 = new Product(P1);
		
		P2.quantity=3;
		
		P1.display();
		P2.display();
		

	}

}
