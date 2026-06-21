import java.util.*;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("Enter the number fo which you want to print the Multiplication table : ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}
