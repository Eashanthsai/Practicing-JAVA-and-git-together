import java.util.*;

public class FindingSecondLargestWithoutSorting {
    public static void main(String args[]){
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > Largest){
                secondLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != Largest){
                secondLargest = arr[i];
            }

        }
        System.out.println("The Second Largest number in the array is : " + secondLargest);
    }
}
