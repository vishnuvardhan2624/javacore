
public class Objectcount {
	
	static int count=0;
	
	Objectcount(){
		count++;
	}

	public static void main(String[] args) {
		
		Objectcount oc1 = new Objectcount();
		Objectcount oc2 = new Objectcount();
		Objectcount oc3 = new Objectcount();
		Objectcount oc4 = new Objectcount();
		System.out.println("number of objects created :"+count);
	
	}

}
