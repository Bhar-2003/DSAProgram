import java.util.Scanner;
public class CountTraillingZeros {
    // Time Complexity : O(n)
    static int countTrailingZeros(int n){
        return (int) (Math.log10((n&n-1)^n)/Math.log10(2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(countTrailingZeros(n));
    }
}
