import java.util.*;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements fo the array : ");
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        } 

        int EvenSum = 0;
        int oddSum = 0;
        
        for(int  i = 0 ; i < n ; i++){
            if(arr[i] % 2 ==0){
                EvenSum = EvenSum + arr[i];
            }
            else{
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("The sum of the even  numbers that you have entered is : "+ EvenSum);
        System.out.println("The sum of the odd numbers tnat you have entered is : " + oddSum);
    }
}
