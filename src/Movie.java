
public class Movie {
	
	static String theatre_name="sri_ramulu";
	static String theatre_location="moosapet";
	
     String movie_name;
     int movie_budjet;
     String release_date;

	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		
		
		
		m1.movie_name="PUSHPA";
		m1.movie_budjet=60000000;
		m1.release_date="12/21/2021";
		
		m2.movie_name="SALAAR";
		m2.movie_budjet=60000000;
		m2.release_date="12/21/2021";
		
		
		m3.movie_name="KALKI";
		m3.movie_budjet=60000000;
		m3.release_date="12/21/2021";
		
		System.out.println(m1.movie_name+": "+m1.movie_budjet+" = "+m1.release_date);
		System.out.println(m2.movie_name+": "+m2.movie_budjet+" = "+m2.release_date);
		System.out.println(m3.movie_name+" : "+m3.movie_budjet+" = "+m3.release_date);
		

	}

}
