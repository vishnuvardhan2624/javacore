import java.util.Scanner;

public class bodymassindex {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your weight");
        double weight = sc.nextDouble();

        System.out.println("enter your height (in meters)");
        double height = sc.nextDouble();

        double BMI = weight/(height * height);

        System.out.println("BMI="+ BMI);

        if(BMI<18.5){
            System.out.println("under weight");
        }
        else if(BMI>18.5 && BMI <24.9){
            System.out.println("normal");
        }
        else if(BMI>25 && BMI<30){
            System.out.println("overweight");
        }
        else{
            System.out.println("obese");
        }
    }
    
}


