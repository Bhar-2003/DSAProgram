import java.util.Scanner;
public class PrimeFactorsTwo {
    // Time Complexity : O(n)
    // Brute Force Approach
    static void printDivisors(int num){
        for(int i=1;i*i<=num;i++){
            {
                if(num%i==0){
                    System.out.println(i);
                    System.out.println(num/i);
                }
            }
        }
    }
    // It will not print in Order
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        printDivisors(num);
    }
}
