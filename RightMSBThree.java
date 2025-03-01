import java.util.Scanner;
public class RightMSBThree {
    // Time Complexity : O(1)
    static int RightMSBit(int n){
//        return n ^ ( n & (n-1)); // this will return the decimal number directly
        return (int)( Math.log10 (n^( n&(n-1) ) ) / Math.log10(2) )+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(RightMSBit(n));
    }
}
