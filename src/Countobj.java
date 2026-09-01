
public class Countobj {
	
	static int count =0;
	
	Countobj (){
		count++;
	}

	

	public static void main(String[] args) {
		
		Countobj c1=new Countobj();
		Countobj c2=new Countobj();
		Countobj c3=new Countobj();
		Countobj c4=new Countobj();
		Countobj c5=new Countobj();
		
		System.out.println("number of objects created:"+count);
		
	}

}
