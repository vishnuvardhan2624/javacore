package javacore11;

public class Student {

	static String collegename = "mallareddy";
	int studentid;
	String studentname;
	int studentmarks;

	public static void main(String[] args) {

		Student s = new Student();

		s.studentid = 7995;
		s.studentname = "vishnu";
		s.studentmarks = 100;

		System.out.println("collegename:" + collegename);
		System.out.println("studentid:" + s.studentid);
		System.out.println("studentname:" + s.studentname);
		System.out.println("studentmarks:" + s.studentmarks);

	}

}
