package constructors;

import java.util.Scanner;

public class Mobilebill {

	String MobileModel;
	int Quantity;
	double price;
	double DeliveryCharge;
	double MobileCost;
	double FinalBill;

	Mobilebill() {
		this("unknown",0,0.0,0.0);

	}

	Mobilebill(String MobileModel) {
		this(MobileModel, 0,0.0,0.0);

	}
	Mobilebill(String Mobilemodel,int Quantity){
		this(Mobilemodel,Quantity,0.0,0.0);
		
	}

	Mobilebill(String MobileModel,int Quantity, double price) {
		this(MobileModel,Quantity, price, 0.0);

	}


	Mobilebill(String MobileModel,int Quantity, double price, double DeliveryCharge) {

		this.MobileModel = MobileModel;
		this.Quantity = Quantity;
		this.price = price;
		this.DeliveryCharge= DeliveryCharge;
		
		this.MobileCost = price * Quantity;
		this.FinalBill = this.MobileCost + this.DeliveryCharge;
	}

	void display() {
		System.out.println("----- Mobile Bill -----");
		System.out.println("Mobile Model: " + MobileModel);
		System.out.println("quantity: " + Quantity);
		System.out.println("price: " + price);
		System.out.println("Mobile Cost: " + MobileCost);
		System.out.println("Delivery Charge: " + DeliveryCharge);
		System.out.println("Final Bill: " + FinalBill);
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("enter your mobile model:");
		String model = sc.nextLine();

		System.out.println("enter the Quantity:");
		int Quantity = sc.nextInt();

		System.out.println("enter the price:");
		double price = sc.nextDouble();

		System.out.println("enter the delivery charge:");
		double delivery = sc.nextDouble();
		
		Mobilebill m = new Mobilebill(model,Quantity,price,delivery);

		m.display();

	}

}
