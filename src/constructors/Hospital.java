package constructors;

public class Hospital {
	
	int patientid;
	String patient_name;
	int age;
	int room_number;
	
	Hospital(int patientid,String patient_name,int age,int room_number){
		
		this.patientid=patientid;
		this.patient_name=patient_name;
		this.age=age;
		this.room_number=room_number;
		
	}
	
	Hospital(Hospital h){
		this.patientid=h.patientid;
		this.patient_name=h.patient_name;
		this.age=h.age;
		this.room_number=h.room_number;
		
	}
	void display() {
		
		System.out.println("the patient id is:"+patientid);
		System.out.println("the patient name  is:"+patient_name);
		System.out.println("the patient age is:"+age);
		System.out.println("the patient room number is:"+room_number);
		System.out.println("--------------------------------------------");
		
	}

	public static void main(String[] args) {
		
		Hospital H = new Hospital(321,"vishnu",23,20);
		
		Hospital h2=new Hospital(H);
		
		h2.room_number=30;
		
		H.display();
		h2.display();
		

	}

}
