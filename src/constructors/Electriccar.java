package constructors;

 class Vechile {
	
	String type;
	String brand;
	double price;
	int batterycapacity;
	
	Vechile(String type){
		this.type = type;
	}

}

//-----------------------------------------------

class Car extends Vechile {
	
	
	Car(String type, String brand,double price){
		super(type);
		this.brand=brand;
		this.price=price;
		
	}
}

//---------------------------------------------------------

public class Electriccar extends Car{
	int batterycapacity;
	
	Electriccar(String type,String brand,double price,int batterycapacity){
		super(type ,brand,price);
		this.batterycapacity=batterycapacity;
		
	}
	
public static void main(String[] args) {
		
	Electriccar ec = new Electriccar("four wheeler","tata",100000.0,7);
		
		ec.display();

	}

	void display() {
		
		System.out.println("vechile type:"+type);
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("batterry capacity:"+batterycapacity);
	}
}
