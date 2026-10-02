package methods;

public class StudentResullt {
	
	int calculateTotal(int telugu,int hindi,int english,int maths,int science,int social) {
		
		return telugu + hindi + english + maths + science + social;
	}
	double calculateAverage(double total) {
		
		return total/6.0 ;
		
	}
	String calculateGarde(double average) {
		
		if(average<30) {
			return "D";
		}

		else if(average<40) {
			return "C";
		}
		else if(average<60 ) {
			return "B";
		}
		else  if(average<80) {
			return "A";
		}
		else {
			System.out.println("fail");
			return "Fail";
		}
		
		
	}
	

	public static void main(String[] args) {
		
		StudentResullt s = new StudentResullt();
		
		int total = s.calculateTotal(20,30,40,50,60,70);
		
		double average = s.calculateAverage(total);
		
		String grade =s.calculateGarde(average);
		
		System.out.println("total marks:"+total);
		System.out.println("average marks:"+average);
		System.out.println("your grade:"+grade);
		
		
	}

}
