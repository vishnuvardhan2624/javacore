package javacore11;

public class Institute {
	
	static String trainer1="ABCD";
	static String trainer2="EFGH";
	
	String emp_name;
	int emp_id;
	String emp_designation;

	public static void main(String[] args) {
		
	Institute emp1 = new Institute();
	Institute emp2 = new Institute();
	Institute emp3 = new Institute();
	Institute emp4 = new Institute();
	Institute emp5 = new Institute();
	

	emp1.emp_name = "vishnu";
	emp1.emp_id= 111;
	emp1.emp_designation= "java tariner";
	
	
	emp2.emp_name = "rahul";
	emp2.emp_id= 222;
	emp2.emp_designation= "python tariner";
	
	emp3.emp_name = "sai";
	emp3.emp_id= 333;
	emp3.emp_designation= "devops tariner";
	
	emp4.emp_name = "goutham";
	emp4.emp_id= 444;
	emp4.emp_designation= "ML tariner";
	
	emp5.emp_name = "ramana";
	emp5.emp_id= 555;
	emp5.emp_designation= "C tariner";
	
	System.out.println(emp1.emp_name+"  :  "+emp1.emp_id+" - "+emp1.emp_designation);
	System.out.println(emp2.emp_name+" : "+emp2.emp_id+" -" +emp2.emp_designation);
	System.out.println(emp3.emp_name+" : "+emp3.emp_id+" - "+emp3.emp_designation);
	System.out.println(emp4.emp_name+" : "+emp4.emp_id+" - "+emp4.emp_designation);
	System.out.println(emp5.emp_name+" : "+emp5.emp_id+" - "+emp5.emp_designation);
	}
}
	
	
	