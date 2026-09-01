import java.util.*;
public class cndstm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter membership period");
        int membership = sc.nextInt();
         
        if(membership==1){
            System.out.println("2000");}
        else if(membership==3){
            System.out.println("3000");}
        else if(membership==6){
            System.out.println("6000");}
        else if(membership==9){
            System.out.println("8000");}
        else if(membership==12){
            System.out.println("10000");}
        else{
            System.out.println("error");
        }
        
    }
    
}
