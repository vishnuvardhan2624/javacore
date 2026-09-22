package methods;

public class Bugtracker {
	
	int bugid;
	String application_name;
	String bug_title;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getbugid() {
		return bugid;
	}
	String getapplication_name() {
		return application_name;
	}
	String getbug_title() {
		return bug_title;
		
	}
	String getseverity() {
		return severity;
	}
	String getpriority() {
		return priority;
	}
	String getstatus() {
		return status;
	}
	String getassignedDeveloper() {
		return assignedDeveloper;
	}
	
	  void assignToDeveloper(int bugId, String developerName) {
		
		 assignedDeveloper = developerName;
		 
		 updateStatus("in development");
	
		
	  }
	 void updateStatus(String newStatus) {
		 status=newStatus;
	 }
	 
	 void display() {
		 
		 System.out.println("bug id:"+getbugid());
		 System.out.println("Application name:"+getapplication_name());
		 System.out.println("the bug titile is:"+getbug_title());
		 System.out.println("the severity is:"+getseverity());
		 System.out.println("the priority is:"+getpriority());
		 System.out.println("the Status is:"+getstatus());
		 System.out.println("the assigned developer is:"+ getassignedDeveloper());
		 
	 }

	public static void main(String[] args) {
		
		Bugtracker b = new Bugtracker();
		
		b.bugid=100;
		b.application_name ="bankig";
		b.bug_title = "abcd";
		b.severity="hard";
		b.priority="first";
		b.status="active";
		b.assignedDeveloper="vishnu";
	    
		b.assignToDeveloper(101,"goutham");
		
	
	   b.display();
	}

}
