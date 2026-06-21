import java.util.*;

public class Factorial_Finding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact  = fact * i;
        }
        System.out.println("The Factorial of " + n + " is " + fact);
    
        sc.close();
    }

}
