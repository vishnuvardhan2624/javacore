
public class Employee {
	
	int empid;
	String emp_name;
	double emp_salary;
	
	void displaydetails() {
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+emp_name);
		System.out.println("employee salary:"+emp_salary);
		
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empid=11;
		e1.emp_name="vishnu";
		e1.emp_salary=40000;
		
		Employee e2 = new Employee();
		e2.empid=22;
		e2.emp_name="prajwal";
		e2.emp_salary=50000;
		
		Employee e3 = new Employee();
		e3.empid=33;
		e3.emp_name="ganesh";
		e3.emp_salary=60000;
		
		e1.displaydetails();
		e2.displaydetails();
		e3.displaydetails();
		
	}

}
