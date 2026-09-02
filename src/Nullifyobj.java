
public class Nullifyobj {
  
	Nullifyobj obj;
 
	public static void main(String[] args) {
		
		Nullifyobj obj1=new Nullifyobj();//assigning null directly
		obj1=null;
		
		Nullifyobj obj2 = new Nullifyobj();  //reassigning reference
		obj2= new Nullifyobj();
		
		
		createobject();    //object goes out of scope
		
		Nullifyobj obj3 = new Nullifyobj();
		Nullifyobj obj4=obj3;
		                          //here we got multiple references
		obj3 = null;
		obj4 = null;
		
	    Nullifyobj obj5 = new Nullifyobj();   //island of isolation
		Nullifyobj obj6 = new Nullifyobj(); 
		
		 obj5.obj = obj6;
		 obj6.obj = obj5;
		 
		 obj5= null;
		 obj6= null;
		 
		 System.out.println("objects are eligible for garbage collection");
		 
	}
	static void createobject() {
		Nullifyobj obj7 = new Nullifyobj();
	}
		 
				

	}


