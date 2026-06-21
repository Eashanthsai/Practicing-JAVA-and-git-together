import java.util.*;

public class CountingPositive_Negative_Zero {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of the array : ");
    int  n = sc.nextInt();
    
    System.out.println("Enter the elements of the array : ");
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
        }

        int positiveSum = 0;
        int negativeSum = 0;
        int zero = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] > 0){
                positiveSum = positiveSum + arr[i];
            }
            else if(arr[i] < 0){
                negativeSum = negativeSum + arr[i];
            }
            else{
                zero++;
            }
        }
        System.out.println("Sum of positive numbers: " + positiveSum);
        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Count of zeros: " + zero);
    }
}
