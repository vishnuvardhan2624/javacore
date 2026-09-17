package methods;

public class Demomethod {
	
	int addition (int a,int b) {
		int result = a+b;
		System.out.println("addition:"+result);
		return result;
	}
		int subtraction(int a,int b) {
			int result = a-b;
			
			System.out.println("subtraction:"+result);
			return result;
		}
			
			int multiplication (int a,int b) {
				int result = a * b;
				System.out.println("multiplication:"+result);
				return result;
			}
				
				int division (int a,int b) {
					int result = a/b;
					System.out.println("division:"+result);
					return result;
				 
					
					
	}

	public static void main(String[] args) {
		
		Demomethod d = new Demomethod();
		
		d.division(d.multiplication(d.subtraction( d.addition(10,20),5),4),5);
	}

}
