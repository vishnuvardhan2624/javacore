
public class Student {
	
	 String student_name;
	 int student_id;
	 int student_marks;
	 
	 void display_details() {
		 
		 System.out.println("student_name:"+student_name);
		 System.out.println("student_id:"+student_id);
		 System.out.println("student_marks:"+student_marks);
		 
	 }
	 
	 void check_results() {
		 
		 if(student_marks>=35) {
			 System.out.println("result:pass");
		 }
		 else {
			 System.out.println("result:fail");
		 }
	 }

	public static void main(String[] args) {
		
		
		Student s1 =new Student();
		s1.student_name = "vishnu";
		s1.student_id = 12;
		s1.student_marks =100;
		
		
		Student s2 =new Student();
		s2.student_name = "prajwal";
		s2.student_id = 13;
		s2.student_marks =100;
		
		
		Student s3 =new Student();
		s3.student_name = "goutham";
		s3.student_id = 14;
		s3.student_marks =100;
		
		s1.display_details();
		s1.check_results();
		
		System.out.println();
		
		s2.display_details();
		s2.check_results();
		
		System.out.println();
		
		s3.display_details();
		s3.check_results();
		
		
		
		
	
	}

}
