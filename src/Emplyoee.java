
public class Emplyoee {
	int emp_id ;
	  byte emp_age;
	  double emp_sal;
	  char emp_grade;
	  byte emp_yop;
	  boolean emp_status;
	  long emp_phno;
	  
	   int leaves=12;
	  int emp_noofleaves;
	  int leaves_applied;
	  
	  Emplyoee(int applied){
		  leaves_applied= applied;
		  leaves=leaves-applied;
		  emp_noofleaves = leaves;
		  
	  }
	  
	  void display() {
  
  
  System.out.println("employee id:"+emp_id);
  System.out.println("employee age:"+emp_age);
  System.out.println("employee salary:"+emp_sal);
  System.out.println("employee grade:"+emp_grade);
  System.out.println("employee years of experience:"+emp_yop);
  System.out.println("employee active status:"+emp_status);
  System.out.println("employee leaves applied:"+leaves_applied);
  System.out.println("employee remaining leaves:"+emp_noofleaves);
  System.out.println("employee phone number:"+emp_phno);
	}
	  
	  public static void main(String[] args) {
		  
		  Emplyoee e1 = new Emplyoee(2);
		  
		  e1.emp_id=123;
		  e1.emp_age=24;
		   e1.emp_sal=45000.0;
		  e1.emp_grade='A';
		  e1.emp_yop=3;
		  e1.emp_status=true;
		  e1.emp_phno=9876543210L;
		  
		  Emplyoee e2 = new Emplyoee(3);
		  
		  
		  e2.emp_id=345;
		  e2.emp_age=24;
		   e2.emp_sal=55000.0;
		  e2.emp_grade='B';
		  e2.emp_yop=5;
		  e2.emp_status=true;
		  e2.emp_phno=9876543210L;
		  
		  e1.display();
		  System.out.println("---------------------------------------------------");
		  e2.display();
		  

	  }
}