package constructors;

public class Laptop {
	
	String brand;
	String model;
	int ram;
	double price;
	
	Laptop(){
		this("unknown","unknown",0,0.0);
		
	}
	Laptop(String brand){
		this(brand,"unknown",0,0.0);
	}
	Laptop(String brand,String model){
		this(brand,model,0,0.0);
		
	}
	Laptop(String brand,String model ,int ram){
		this(brand,model,ram,0.0);
		
	}
	Laptop(String brand,String model ,int ram,double price){
		this.brand=brand;
		this.model=model;
		this.ram = ram;
		this.price=price;
		
	}
	void display() {
		System.out.println("enter the brand name:"+brand);
		System.out.println("enter the model:"+model);
		System.out.println("enter the ram:"+ram);
		System.out.println("price:"+price);
		
	}

	public static void main(String[] args) {
		
		Laptop l = new Laptop("ASUS","A15",250,60000);
		
		l.display();

		
	}

}
