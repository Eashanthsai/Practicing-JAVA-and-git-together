import java.util.*;

public class PrintingEvenNUmbers {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Starting number : ");
     int n = sc.nextInt();
     System.out.println("Enter the Ending number :" );
     int m = sc.nextInt();
     System.out.println("The Even number between " + n +" and " + m + " are : ");
     for(int i = n ; i <= m ; i++){
        
        if(i % 2 == 0){
            System.out.println(i);
        }
     }   
    }
}