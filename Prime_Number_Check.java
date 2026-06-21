import java.util.*;

public class Prime_Number_Check {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check Whether it is prime ot not : ");

        int n = sc.nextInt();
        boolean Prime = true;
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                Prime = false;
                break;
            }else{
                Prime = true;
            }
        }
        if(Prime ==  true){
            System.out.println(n + " is a Prime number.");
        }else{
            System.out.println(n + " is not a Prime number.");
        }
    }
}