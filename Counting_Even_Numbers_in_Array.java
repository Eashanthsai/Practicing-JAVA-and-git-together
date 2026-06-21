import java.util.*;

public class Counting_Even_Numbers_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the Array : ");
        
        int n = sc.nextInt();
        
        System.out.println("Enter the Elements of the Array : ");
        
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i++)
            {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for(int  i = 0 ; i < n; i++){
                if(arr[i] % 2 == 0){
                    count++;
                }
            }

            System.out.println("The number of Even numbers in your array is : "+count);
    }
}
