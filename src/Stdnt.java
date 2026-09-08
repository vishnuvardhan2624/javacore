
public class Stdnt {
	
	String name;
	int age;
	String college_name;
		
		void display() {
			System.out.println("name is :"+name);
			System.out.println("age:"+age);
			System.out.println("college:"+college_name);
		}
			
			
		public static void main(String[] args) {
			
			Stdnt s = new Stdnt();
			
			
			s.name="vishnu";
			s.age= 22;
			s.college_name="mallareddy";
			
			s.display();

	}

}
